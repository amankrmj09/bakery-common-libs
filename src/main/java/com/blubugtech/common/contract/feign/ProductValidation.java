package com.blubugtech.common.contract.feign;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductValidation {
    private UUID productId;
    private Boolean available;
    private Integer stockQuantity;
    private BigDecimal currentPrice;

    public ProductValidation() {}

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }
}
