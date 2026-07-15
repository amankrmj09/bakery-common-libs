package com.blubugtech.common.dto;

import java.util.UUID;

public class StockOperationResponseDto {
    private UUID productId;
    private Boolean success;
    private String message;

    public StockOperationResponseDto() {}

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
