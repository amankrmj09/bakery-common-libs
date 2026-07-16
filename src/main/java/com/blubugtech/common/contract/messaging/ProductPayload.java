package com.blubugtech.common.contract.messaging;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductPayload {
    private UUID productId;
    private String sku;
    private String name;
    private String description;
    private String categoryName;
    private BigDecimal price;
    private String status; // ACTIVE, INACTIVE, DISCONTINUED
    private List<String> tags;
    private String action; // CREATED, UPDATED, DELETED
    private LocalDateTime timestamp;
}
