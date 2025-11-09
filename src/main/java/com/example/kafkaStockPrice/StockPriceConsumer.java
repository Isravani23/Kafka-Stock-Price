package com.example.kafkaStockPrice;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class StockPriceConsumer {

    @KafkaListener(topics = "Kafka-Stock-Price", groupId = "stock-consumer")
    public void listen(String message) {
        // Example message: "APL,125.32"
        try {
            String[] parts = message.split(",");
            String symbol = parts[0];
            double price = Double.parseDouble(parts[1]);
            System.out.printf("Stock Update → Symbol: %s | Price: %.2f%n", symbol, price);
        } catch (Exception e) {
            System.err.println("Invalid message format: " + message);
        }
    }

}
