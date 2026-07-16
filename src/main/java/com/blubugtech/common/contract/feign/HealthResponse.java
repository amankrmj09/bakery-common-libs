package com.blubugtech.common.contract.feign;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthResponse {
    private String status;
    private String service;
    private LocalDateTime timestamp;
    private Object details;

    public HealthResponse(String status, String service) {
        this.status = status;
        this.service = service;
        this.timestamp = LocalDateTime.now();
    }
}
