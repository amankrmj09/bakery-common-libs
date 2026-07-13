package org.devofblue.common.dto;

import java.math.BigDecimal;

public class RevenuePayloadDto {
    private BigDecimal amount;

    public RevenuePayloadDto() {}

    public RevenuePayloadDto(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
