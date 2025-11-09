FROM openjdk:17-jdk-alpine
# Use Maven to build your Spring Boot jar first!
VOLUME /tmp
COPY target/Kafka-Stock-Price-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
