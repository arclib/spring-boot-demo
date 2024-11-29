package com.example.modules.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class DemoKafkaApplication {
    public static void main(String[] args) {
     SpringApplication.run(DemoKafkaApplication.class, args);

    }
    // @Bean
    // CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
    //     return args -> {
    //         String topic = "test-topic";
    //         for (int i = 1; i <= 10; i++) {
    //             String message = "Message " + i;
    //             kafkaTemplate.send(topic, message);
    //             System.out.println("Sent: " + message);
    //             Thread.sleep(500); // 模拟消息发送间隔
    //         }
    //     };
    // }

}
