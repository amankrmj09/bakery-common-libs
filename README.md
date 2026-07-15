# Bakery Common Libs

Shared DTOs, Utilities, and Exceptions for the Bakery Microservices architecture.

## Features
- **Centralized DTOs**: Consistent data transfer objects for inter-service communication.
- **Global Error Handling**: Standardized exception handling (e.g., `BaseExceptionHandler`).
- **Standardized Logging**: Centralized `logback-base.xml` for strict SLF4J daily rolling file logs.
- **Security & Web Utils**: Shared security dependencies and utilities.

## Usage

Add the dependency to your `build.gradle.kts`:

```kotlin
implementation("org.devofblue:common-libs:2.0.0")
```

Include the logging configuration in your microservice's `src/main/resources/logback-spring.xml`:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
    <include resource="logback-base.xml"/>
</configuration>
```
