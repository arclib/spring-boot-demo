package com.example.modules.kafka.consumer;

import org.springframework.stereotype.Service;
 
@Service
public class SingleConsumer {
    // @KafkaListener(topics = "test-topic", groupId = "test-group", containerFactory = "singleFactory", autoStartup = "true")
    // public void listen(ConsumerRecord<String, String> record, Acknowledgment acknowledgment) {
    //     System.out.println("SingleConsumer - Received: " + record.value());
    //     // 手动提交offset
    //     acknowledgment.acknowledge();
    // }
}