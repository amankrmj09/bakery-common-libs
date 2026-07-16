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
public class PaymentPayload {
    private UUID paymentId;
    private UUID orderId;
    private UUID userId;
    private String customerEmail;
    private String status; // SUCCESS, FAILED, REFUNDED
    private BigDecimal amount;
    private LocalDateTime timestamp;
}
