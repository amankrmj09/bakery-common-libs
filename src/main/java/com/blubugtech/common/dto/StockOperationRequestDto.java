package com.blubugtech.common.dto;

public class StockOperationRequestDto {
    private Integer quantity;

    public StockOperationRequestDto() {}

    public StockOperationRequestDto(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
