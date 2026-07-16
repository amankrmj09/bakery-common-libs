package com.blubugtech.common.contract.messaging;

public class StockOperationRequestPayload {
    private Integer quantity;

    public StockOperationRequestPayload() {}

    public StockOperationRequestPayload(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
