package com.kadiraksoy.SpringKafka.Producer;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {


    private final KafkaTemplate<String,String> template;

    public Producer(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void sendMessage(String message){
        template.send("appTopics", message);
    }
}
