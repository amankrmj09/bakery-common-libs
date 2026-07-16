package com.blubugtech.common.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.experimental.SuperBuilder;

import java.time.Instant;
import java.util.Map;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BaseEvent<T> {
    @Builder.Default
    private String eventId = UUID.randomUUID().toString();
    private String eventType;
    @Builder.Default
    private Instant timestamp = Instant.now();
    private T payload;
    private Map<String, Object> metadata;
}
