package com.kadiraksoy.SpringKafka.Consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {


    @KafkaListener(topics = "appTopics", groupId = "group1")
    public void listenMessage(String message){
        System.out.println(message);
    }
}

