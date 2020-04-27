package com.rabbitmq.consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "${spring.rabbitmq.queue}")
public class Consumer {

	Logger logger = LogManager.getLogger(Consumer.class);

	@RabbitHandler
	public void receive(String in) {
		logger.info(" [x] Received '" + in + "'");
	}
}
