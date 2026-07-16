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
public class PaymentRequestedPayload {
    private UUID orderId;
    private UUID userId;
    private String paymentMethod;
    private BigDecimal amount;
    private String currencyCode;
    private String cardLastFour;
    private String cardBrand;
    private String cardType;
    private String digitalWalletProvider;
    private String bankName;
    private String notes;
    private LocalDateTime timestamp;
}
