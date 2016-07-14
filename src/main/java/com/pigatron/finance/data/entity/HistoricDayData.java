package com.pigatron.finance.data.entity;


import java.util.Date;

public class HistoricDayData {

    private Date date;
    private float open;
    private float high;
    private float low;
    private float close;
    private float volume;
    private float adjustedClose;

    private HistoricDayData(Builder builder) {
        setDate(builder.date);
        setOpen(builder.open);
        setHigh(builder.high);
        setLow(builder.low);
        setClose(builder.close);
        setVolume(builder.volume);
        setAdjustedClose(builder.adjustedClose);
    }

    public static Builder builder() {
        return new Builder();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getOpen() {
        return open;
    }

    public void setOpen(float open) {
        this.open = open;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public float getLow() {
        return low;
    }

    public void setLow(float low) {
        this.low = low;
    }

    public float getClose() {
        return close;
    }

    public void setClose(float close) {
        this.close = close;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getAdjustedClose() {
        return adjustedClose;
    }

    public void setAdjustedClose(float adjustedClose) {
        this.adjustedClose = adjustedClose;
    }


    @Override
    public String toString() {
        return "HistoricDayData{" +
                "date=" + date +
                ", open=" + open +
                ", high=" + high +
                ", low=" + low +
                ", close=" + close +
                ", volume=" + volume +
                ", adjustedClose=" + adjustedClose +
                '}';
    }

    public static final class Builder {
        private Date date;
        private float open;
        private float high;
        private float low;
        private float close;
        private float volume;
        private float adjustedClose;

        private Builder() {
        }

        public Builder withDate(Date val) {
            date = val;
            return this;
        }

        public Builder withOpen(float val) {
            open = val;
            return this;
        }

        public Builder withHigh(float val) {
            high = val;
            return this;
        }

        public Builder withLow(float val) {
            low = val;
            return this;
        }

        public Builder withClose(float val) {
            close = val;
            return this;
        }

        public Builder withVolume(float val) {
            volume = val;
            return this;
        }

        public Builder withAdjustedClose(float val) {
            adjustedClose = val;
            return this;
        }

        public HistoricDayData build() {
            return new HistoricDayData(this);
        }
    }
}
