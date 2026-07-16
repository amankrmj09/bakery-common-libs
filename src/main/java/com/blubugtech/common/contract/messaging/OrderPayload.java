package com.blubugtech.common.contract.messaging;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderPayload {
    private UUID orderId;
    private String orderNumber;
    private UUID userId;
    private String customerEmail;
    private BigDecimal totalAmount;
    private String status; // PENDING, CONFIRMED, CANCELLED, etc.
    private LocalDateTime timestamp;
}
