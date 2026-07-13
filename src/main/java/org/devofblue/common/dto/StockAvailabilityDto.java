package org.devofblue.common.dto;

public class StockAvailabilityDto {
    private Boolean sufficient;
    private Integer availableQuantity;

    public StockAvailabilityDto() {}

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
