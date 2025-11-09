package com.example.kafkaStockPrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling

public class KafkaStockPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaStockPriceApplication.class, args);
	}

}
