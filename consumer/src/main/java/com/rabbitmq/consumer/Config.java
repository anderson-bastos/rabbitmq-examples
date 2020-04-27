package com.rabbitmq.consumer;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("hello-world")
@Configuration
public class Config {
	
	@Value("${spring.rabbitmq.queue}")
	private String queueName;
	
	@Bean
    public Queue hello() {
        return new Queue(queueName);
    }

    @Bean
    public Consumer receiver() {
        return new Consumer();
    }
}
