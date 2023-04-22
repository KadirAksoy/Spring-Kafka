package com.kadiraksoy.SpringKafka;

import com.kadiraksoy.SpringKafka.Producer.Producer;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}


	@Bean
	public ApplicationRunner runner(Producer p) {
		return args -> {
			p.sendMessage("Welcome to Spring Kafka ");
		};
	}

}
