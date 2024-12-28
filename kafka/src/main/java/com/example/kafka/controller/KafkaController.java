package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.producer.KafkaProducerService;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaProducerService producer;
	
	@PostMapping("/send")
	public String sendMessage(@RequestParam String message) {
		producer.sendMessage(message);
		return "Mensaje enviado: " + message;
	}
	

}
