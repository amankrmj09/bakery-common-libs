package com.blubugtech.common.contract.messaging;

import java.math.BigDecimal;

public class RevenuePayload {
    private BigDecimal amount;

    public RevenuePayload() {}

    public RevenuePayload(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
