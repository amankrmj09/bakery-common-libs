package org.devofblue.common.event;

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
public class PaymentEvent {
    private UUID paymentId;
    private UUID orderId;
    private String status; // SUCCESS, FAILED, REFUNDED
    private BigDecimal amount;
    private LocalDateTime timestamp;
}
