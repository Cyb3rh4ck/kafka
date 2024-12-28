package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class KafkaConsumerService {
	

	@KafkaListener(topics = "motivus", groupId = "my-group")
	public void listen(String message) {
		log.info("Mensaje recibido: " + message);
		
	}
	

}
