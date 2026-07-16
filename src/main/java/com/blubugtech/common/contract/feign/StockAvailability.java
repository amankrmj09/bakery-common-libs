package com.blubugtech.common.contract.feign;

public class StockAvailability {
    private Boolean sufficient;
    private Integer availableQuantity;

    public StockAvailability() {}

    public Boolean getSufficient() {
        return sufficient;
    }

    public void setSufficient(Boolean sufficient) {
        this.sufficient = sufficient;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }
}
