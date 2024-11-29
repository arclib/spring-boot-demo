package com.example.modules.kafka.consumer;

import org.springframework.stereotype.Service;
 
@Service
public class BatchConsumer {
 
    // @KafkaListener(topics = "test-topic", groupId = "test-group", containerFactory = "batchFactory", autoStartup = "false")
    // public void batchListen(List<String> messages, Acknowledgment acknowledgment) {
    //     System.out.println("BatchConsumer - Received batch: " + messages);
    //     // 手动提交offset
    //     acknowledgment.acknowledge();
    // }
}