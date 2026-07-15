# 🧁 Common Libs

![Java](https://img.shields.io/badge/Java-21%2B-orange.svg)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)

Welcome to the **Common Libs**, a core utility package of the Shah's Bakery Microservice Platform.

## 🎯 Purpose
The Common Libs repository provides shared Data Transfer Objects (DTOs), exceptions, generic utilities, and standardized configurations (like logging) used across all bakery microservices.

## 🛠️ Features
- **Centralized DTOs**: Consistent data models for inter-service communication.
- **Global Error Handling**: Standardized exception structures.
- **Standardized Logging**: Pre-configured SLF4J/Logback configurations.
- **Shared Event Models**: Common event definitions for Kafka messaging.
- **Shared Security & Feign Configurations**: Pre-configured interceptors and error decoders for secure and reliable inter-service calls.

## 📁 Folder Structure
The main `src/main/java` directory is organized as follows:
```text
src/
└── main/
    └── java/org/devofblue/common/
        ├── dto/        # Shared Data Transfer Objects for consistent inter-service communication.
        ├── event/      # Shared Kafka event models (e.g., OrderEvent, PaymentEvent).
        ├── exception/  # Standardized error structures and a Base Exception Handler.
        ├── feign/      # Shared configurations and Error Decoders for Feign clients.
        ├── kafka/      # Common Kafka serialization/deserialization configurations.
        └── security/   # Shared JWT interception and Header Authentication filters.
```

## 🚀 Getting Started

### Local Setup
1. Include this library in your service's `build.gradle.kts`:
   ```kotlin
   implementation("org.devofblue:common-libs:2.0.0")
   ```
2. For logging, add to your `logback-spring.xml`:
   ```xml
   <include resource="logback-base.xml"/>
   ```

## 🔗 Related Links
- [Main Platform README](../README.md)
