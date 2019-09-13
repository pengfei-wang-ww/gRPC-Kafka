package com.ww.api.hs.messaging;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.StringSerializer;
import java.io.IOException;
import java.util.Properties;
import java.util.UUID;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class EventProducer extends EventServiceGrpc.EventServiceImplBase {

    static final Logger logger = LoggerFactory.getLogger(EventProducer.class);

    static final int GRPC_PORT = 8080;
    static final String BOOTSTRAP_SERVER = "localhost:9092";
    static final String STREAMS_APP_ID = "hs-events-streams";
    static final String SCHEMA_REGISTRY_URL = "http://localhost:8081";
    static final String EVENT_STORE_TOPIC = "hs.event._store";

    private Producer<String, com.ww.api.hs.messaging.avro.Event> eventStoreProducer;
    private Producer<String, String> eventMessageProducer; // TODO: remove eventMessageProducer, eventMessage should source out from eventStore


    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(GRPC_PORT)
                .addService(new EventProducer())
                .build();
        server.start();
        server.awaitTermination();
    }

    public EventProducer() {
        // build producer
        Properties eventStoreProducerProps = new Properties();
        eventStoreProducerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        eventStoreProducerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        eventStoreProducerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        eventStoreProducerProps.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, "true");
        eventStoreProducerProps.put(ProducerConfig.ACKS_CONFIG, "all");
        eventStoreProducerProps.put(ProducerConfig.RETRIES_CONFIG, Integer.toString(Integer.MAX_VALUE));
        eventStoreProducerProps.put(ProducerConfig.MAX_IN_FLIGHT_REQUESTS_PER_CONNECTION, "5");
        eventStoreProducerProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);
        eventStoreProducer = new KafkaProducer<>(eventStoreProducerProps);

        Properties eventMessageProducerProps = new Properties();
        eventMessageProducerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        eventMessageProducerProps.put(ProducerConfig.ACKS_CONFIG, "all");
        eventMessageProducerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        eventMessageProducerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        eventMessageProducer = new KafkaProducer<>(eventMessageProducerProps);

        // build streams - properties
        Properties streamsProps = new Properties();
        streamsProps.put(StreamsConfig.APPLICATION_ID_CONFIG, STREAMS_APP_ID);
        streamsProps.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        streamsProps.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        streamsProps.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        streamsProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);

        // build streams - topology
        final StreamsBuilder builder = new StreamsBuilder();
        KStream<String, com.ww.api.hs.messaging.avro.Event> source = builder.stream(EVENT_STORE_TOPIC);
    }

    @Override
    public void postOne(Event request, StreamObserver<PostResponse> responseObserver) {
        com.ww.api.hs.messaging.avro.Event avroEvent = protobufEventToAvro(request, UUID.randomUUID().toString());
        send(avroEvent);

        PostResponse resp = PostResponse.newBuilder()
                .setFeedbackId(avroEvent.getMetadata().getFeedbackId().toString())
                .build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<Event> postMany(StreamObserver<PostResponse> responseObserver) {
        return new StreamObserver<Event>() {
            String feedbackId = UUID.randomUUID().toString();
            int eventCount = 0;

            @Override
            public void onNext(Event event) {
                eventCount ++;
                com.ww.api.hs.messaging.avro.Event avroEvent = protobufEventToAvro(event, feedbackId);
                send(avroEvent);
            }

            @Override
            public void onError(Throwable throwable) {
                logger.error("[postMany] failed");
            }

            @Override
            public void onCompleted() {
                PostResponse resp = PostResponse.newBuilder()
                        .setFeedbackId(feedbackId)
                        .build();
                responseObserver.onNext(resp);
                responseObserver.onCompleted();

                logger.info("[postMany] eventCount = " + eventCount);
            }
        };
    }

    private com.ww.api.hs.messaging.avro.Event protobufEventToAvro(Event request, String feedbackId) {
        com.ww.api.hs.messaging.avro.EventMetadata avroMetadata = new com.ww.api.hs.messaging.avro.EventMetadata(
                request.getMetadata().getTimestamp(),
                feedbackId,
                request.getMetadata().getService()
        );

        com.ww.api.hs.messaging.avro.Event avroEvent = new com.ww.api.hs.messaging.avro.Event(
                request.getAggregateType(),
                request.getAggregateId(),
                request.getAction(),
                request.getVersion(),
                request.getJson().toString(),
                avroMetadata
        );

        return avroEvent;
    }

    // TODO: remove eventMessageProducer, eventMessage should source out from eventStore
    private void send(com.ww.api.hs.messaging.avro.Event event) {
        final ProducerRecord<String, com.ww.api.hs.messaging.avro.Event> eventStoreRecord = new ProducerRecord<>(EVENT_STORE_TOPIC, event);
        eventStoreProducer.send(eventStoreRecord);

        final ProducerRecord<String, String> eventRecord = new ProducerRecord<>(event.getAggregateType().toString(), event.getJson().toString());
        eventMessageProducer.send(eventRecord);
    }

    private void close() {
        eventStoreProducer.close();
        eventMessageProducer.close();
    }

}

// java -cp hs-events.jar com.ww.api.hs.messaging.EventProducer
