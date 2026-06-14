E-Commerce Microservices Platform
Overview

A cloud-native E-Commerce application developed using Spring Boot Microservices architecture.

The platform consists of multiple independent services communicating through REST APIs and Apache Kafka while being secured using Keycloak OAuth2 authentication.

Architecture

Services:

Product Service
Order Service
Inventory Service
Notification Service
API Gateway
Angular Frontend
Technologies
Backend
Java 21
Spring Boot
Spring Cloud Gateway
Spring Data JPA
MongoDB
MySQL
Kafka
Flyway
Keycloak
Resilience4j
Observability
Prometheus
Grafana
Loki
Zipkin
Tempo
Testing
JUnit
Testcontainers
Rest Assured
DevOps
Docker
Docker Compose
Features
Product Management
Inventory Tracking
Order Processing
Event Driven Communication using Kafka
Email Notifications
OAuth2 Authentication with Keycloak
Circuit Breaker Pattern
API Gateway Routing
Distributed Tracing
Metrics Monitoring
Centralized Logging

Running the Project
docker-compose up -d

Start services individually:

mvn spring-boot:run
