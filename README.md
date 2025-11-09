# 📈 Kafka Stock Price App

A **real-time stock price streaming application** built with **Spring Boot**, **Apache Kafka**, and **Docker Compose**.  
The app simulates live stock updates, publishes them to a Kafka topic, and consumes those updates to display real-time data.

---

## 🧠 Overview

Kafka Stock Price App is a simple Spring Boot application built to demonstrate how Apache Kafka works for real-time message streaming. 
It consists of three main services:

1. **Zookeeper** – manages Kafka brokers and cluster metadata  
2. **Kafka Broker** – handles publishing and subscribing to topics  
3. **Spring Boot App** – generates and consumes stock price events
The app is fully containerized using Docker Compose, which automatically starts Zookeeper, Kafka, and the Spring Boot service.
---

## 🚀 Features
- Generates **random stock prices** for symbols like `AAPL`, `GOOGL`, `AMZN`.
- Publishes updates to Kafka topic `stock-prices`.
- Consumes messages in **real time** and logs updates.
- Fully containerized with **Docker Compose**.
- Demonstrates **event-driven architecture** with asynchronous communication.

 ## To run the project:
Build the Spring Boot app using Maven or Gradle.
Run docker-compose up --build to start Zookeeper, Kafka, and the app.
The producer will automatically begin sending random stock prices to Kafka.
The consumer will read and display those stock updates in the console.
The Kafka Stock Price App provides a simple yet powerful way to understand how real-time data streaming works using Apache Kafka and Spring Boot.


