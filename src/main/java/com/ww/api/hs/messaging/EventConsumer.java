package com.ww.api.hs.messaging;

import com.google.protobuf.Struct;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;


// TODO: consumer has to be idempotent for duplicate messages
public class EventConsumer extends EventServiceGrpc.EventServiceImplBase {

    static final Logger logger = LoggerFactory.getLogger(EventConsumer.class);

    static final int GRPC_PORT = 8082;
    static final String BOOTSTRAP_SERVER = "localhost:9092";
    static final String CONSUMER_GROUP_ID = "hs-events-subscribe";

    final private KafkaConsumer<String, String> consumer;


    public static void main(String[] args) throws InterruptedException, IOException {
        Server server = ServerBuilder.forPort(GRPC_PORT)
                .addService(new EventConsumer())
                .build();
        server.start();
        server.awaitTermination();
    }

    public EventConsumer() {
        Properties properties = new Properties();
        properties.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVER);
        properties.put(ConsumerConfig.GROUP_ID_CONFIG, CONSUMER_GROUP_ID);
        properties.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        properties.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);

        consumer = new KafkaConsumer<>(properties);
    }


    @Override
    public void subscribe(SubscribeRequest request, StreamObserver<SubscribeResponse> responseObserver) {
        logger.info("[subscribe] to event: " + request.getAggregateType());

        List topics = Arrays.asList(request.getAggregateType());
        consumer.subscribe(topics);

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
            for (ConsumerRecord<String, String> record: records) {
                Struct json = Struct.newBuilder().pu
                SubscribeResponse resp = SubscribeResponse.newBuilder()
                        .setJson()
                        .setJson(record.value())
                        .build();
                responseObserver.onNext(resp);

                logger.info(record.value());
            }
        }
    }

}


// java -cp hs-events.jar com.ww.api.hs.messaging.EventConsumer