package com.ww.api.hs.messaging;

import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.*;

public class EventFeedback extends EventServiceGrpc.EventServiceImplBase {

    static final Logger logger = LoggerFactory.getLogger(EventFeedback.class);

    static final int GRPC_PORT = 8083;
    static final String BOOTSTRAP_SERVER = "localhost:9092";
    static final String CONSUMER_GROUP_ID = "hs.feedback";
    static final String FEEDBACK_SOURCE_TOPIC = "hs.event._feedback";
    static final String FEEDBACK_TOPIC_PREFIX = "hs.event._feedback.";
    static final String SCHEMA_REGISTRY_URL = "http://localhost:8081";

    private Producer<String, com.ww.api.hs.messaging.avro.Feedback> feedbackProducer;
    private KafkaConsumer<String, com.ww.api.hs.messaging.avro.Feedback> consumer;


    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(GRPC_PORT)
                .addService(new EventFeedback())
                .build();
        server.start();
        server.awaitTermination();
    }

    public EventFeedback() {
        buildConsumer();
        buildAdminClient();
        buildProducers();
    }

    @Override
    public void sendFeedback(Feedback request, StreamObserver<SendFeedbackResponse> responseObserver) {
        com.ww.api.hs.messaging.avro.Feedback avroFeedBack = protobufToAvro(request);

        // send to source feedback topic
        ProducerRecord<String, com.ww.api.hs.messaging.avro.Feedback> sourceRecord = new ProducerRecord<>(
                FEEDBACK_SOURCE_TOPIC,
                request.getFeedbackId(),
                avroFeedBack
        );
        feedbackProducer.send(sourceRecord);

        // send to the given feedback id
        ProducerRecord<String, com.ww.api.hs.messaging.avro.Feedback> feedbackRecord = new ProducerRecord<>(
                FEEDBACK_TOPIC_PREFIX + request.getFeedbackId(),
                request.getFeedbackId(),    // still need key to keep messages in order
                avroFeedBack
        );
        feedbackProducer.send(feedbackRecord);  // TODO: should source out of sourceFeedbackProducer

        // send gRPC response
        SendFeedbackResponse resp = SendFeedbackResponse.newBuilder().build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    @Override
    public void getFeedback(GetFeedbackRequest request, StreamObserver<Feedback> responseObserver) {
        logger.info("START [getFeedback] id: " + request.getFeedbackId());

        Collection topic = Collections.singleton(FEEDBACK_TOPIC_PREFIX + request.getFeedbackId());
        consumer.subscribe(topic);

        while (true) {
            ConsumerRecords<String, com.ww.api.hs.messaging.avro.Feedback> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, com.ww.api.hs.messaging.avro.Feedback> record : records) {
                Feedback resp = avroToProtobuf(record.value());
                responseObserver.onNext(resp);

                if (record.value().getStatus() == com.ww.api.hs.messaging.avro.FeedbackStatus.COMPLETED) {
                    logger.info("END [getFeedback] id: " + request.getFeedbackId());
                    responseObserver.onCompleted();
                } else {
                    logger.info("[getFeedback] id: " + record.value().getFeedbackId()
                            + ", status: " + record.value().getStatus().toString());
                }
            }
        }
    }

    private void buildProducers() {
        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        producerProps.put(ProducerConfig.ACKS_CONFIG, "all");
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        producerProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);

        feedbackProducer = new KafkaProducer<>(producerProps);
    }

    private void buildConsumer() {
        Properties consumerProps = new Properties();
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, CONSUMER_GROUP_ID);
        // consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, KafkaAvroDeserializer.class);
        consumerProps.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, true);
        consumerProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);

        consumer = new KafkaConsumer<>(consumerProps);
    }

    private void buildAdminClient() {
        Properties adminClientProps = new Properties();
        adminClientProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        adminClientProps.put(ConsumerConfig.CLIENT_ID_CONFIG, CONSUMER_GROUP_ID);
    }

/*
    private void buildStreams() {
        Properties streamProps = new Properties();
        streamProps.put(StreamsConfig.APPLICATION_ID_CONFIG, STREAMS_APP_ID);
        streamProps.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        streamProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        streamProps.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass());
        streamProps.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, AbstractKafkaAvroSerDeConfig.class);
        streamProps.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, SCHEMA_REGISTRY_URL);

        KStream<String, com.ww.api.hs.messaging.avro.Feedback>[] branches = builder.stream(EVENT_FEEDBACK_TOPIC)
                .branch((key, appearance) -> "drama".equals(appearance.getGenre()),
                        (key, appearance) -> "fantasy".equals(appearance.getGenre()),
                        (key, appearance) -> true);
    }

    private Topology buildTopology(Properties properties) {
        final StreamsBuilder builder = new StreamsBuilder();
        final String feedbackTopic = EVENT_FEEDBACK_TOPIC;

        KStream<String, RawMovie> rawMovies = builder.stream(feedbackTopic);
        KStream<Long, Movie> movies = rawMovies.map((key, rawMovie) ->
                new KeyValue<Long, Movie>(rawMovie.getId(), convertRawMovie(rawMovie)));

        movies.to("movies", Produced.with(Serdes.Long(), movieAvroSerde(envProps)));

        return builder.build();
    }

 */

    private com.ww.api.hs.messaging.avro.Feedback protobufToAvro(Feedback protobufData) {
        com.ww.api.hs.messaging.avro.FeedbackStatus status;
        switch(protobufData.getStatus()) {
            case OK:
                status = com.ww.api.hs.messaging.avro.FeedbackStatus.OK;
                break;
            case COMPLETED:
                status = com.ww.api.hs.messaging.avro.FeedbackStatus.COMPLETED;
                break;
            case CANCELED:
                status = com.ww.api.hs.messaging.avro.FeedbackStatus.CANCELED;
                break;
            default:
                status = com.ww.api.hs.messaging.avro.FeedbackStatus.ERROR;
        }

        com.ww.api.hs.messaging.avro.FeedbackMessageType msgType;
        switch (protobufData.getMessageType()) {
            case JSON:
                msgType = com.ww.api.hs.messaging.avro.FeedbackMessageType.JSON;
                break;
            default:
                msgType = com.ww.api.hs.messaging.avro.FeedbackMessageType.TEXT;
        }

        return new com.ww.api.hs.messaging.avro.Feedback(
                protobufData.getFeedbackId(),
                status,
                msgType,
                protobufData.getMessage()
        );
    }

    private Feedback avroToProtobuf(com.ww.api.hs.messaging.avro.Feedback avroData) {
        FeedbackStatus status;
        switch (avroData.getStatus()) {
            case OK:
                status = FeedbackStatus.OK;
                break;
            case COMPLETED:
                status = FeedbackStatus.COMPLETED;
                break;
            case CANCELED:
                status = FeedbackStatus.CANCELED;
                break;
            default:
                status = FeedbackStatus.ERROR;
        }

        FeedbackMessageType msgType;
        switch (avroData.getMessageType()) {
            case JSON:
                msgType = FeedbackMessageType.JSON;
                break;
            default:
                msgType = FeedbackMessageType.TEXT;
        }

        return Feedback.newBuilder()
                .setFeedbackId(avroData.getFeedbackId().toString())
                .setStatus(status)
                .setMessageType(msgType)
                .setMessage(avroData.getMessage().toString())
                .build();
    }

}

/*
    1. a new producer/consumer per request
    2. close/flush after response finished
    3. balance of partitions and consumer?
*/


// java -cp hs-events.jar com.ww.api.hs.messaging.EventFeedback