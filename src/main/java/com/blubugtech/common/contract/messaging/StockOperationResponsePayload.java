package com.blubugtech.common.contract.messaging;

import java.util.UUID;

public class StockOperationResponsePayload {
    private UUID productId;
    private Boolean success;
    private String message;

    public StockOperationResponsePayload() {}

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
