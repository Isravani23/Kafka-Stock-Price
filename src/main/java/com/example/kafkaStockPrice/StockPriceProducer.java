package com.example.kafkaStockPrice;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class StockPriceProducer {
    private final KafkaTemplate<String,String> kafkaTemplate;
    private final String[] symbols = {"APL", "GOOG", "MSFT", "AMZN"};
    private final Random random = new Random();
    public StockPriceProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    @Scheduled(fixedRate = 5000)
    public void sendRandomPrice() {
        String symbol = symbols[random.nextInt(symbols.length)];
        double price = 100 + random.nextDouble() * 1000;
        String message = symbol + "," + price;
        kafkaTemplate.send("Kafka-Stock-Price", message);
        System.out.println("Sent: " + message);
    }
}
