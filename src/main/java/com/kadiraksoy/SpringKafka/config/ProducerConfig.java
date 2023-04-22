package com.kadiraksoy.SpringKafka.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProducerConfig {

    @Value(value = "${kafka.server}")
    private String serverAddress;

}
