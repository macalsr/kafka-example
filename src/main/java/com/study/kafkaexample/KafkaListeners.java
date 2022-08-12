package com.study.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "firstTopic", groupId = "group_id")
    void listener(String data) {
        System.out.println("Message received: " + data +" :)");
    }
}
