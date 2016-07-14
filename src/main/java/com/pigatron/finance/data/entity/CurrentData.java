package com.pigatron.finance.data.entity;


public class CurrentData {

    private float lastTradePrice;
    private float change;

    private CurrentData(Builder builder) {
        setLastTradePrice(builder.lastTradePrice);
        setChange(builder.change);
    }

    public static Builder builder() {
        return new Builder();
    }

    public float getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(float lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public float getChange() {
        return change;
    }

    public void setChange(float change) {
        this.change = change;
    }


    public static final class Builder {
        private float lastTradePrice;
        private float change;

        private Builder() {
        }

        public Builder withLastTradePrice(float val) {
            lastTradePrice = val;
            return this;
        }

        public Builder withChange(float val) {
            change = val;
            return this;
        }

        public CurrentData build() {
            return new CurrentData(this);
        }
    }
}
