package com.pigatron.finance.client.impl.yahoo.historic;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class YahooHistoricQuote {

    @JsonProperty("Symbol")
    private String symbol;

    @JsonProperty("Date")
    private Date date;

    @JsonProperty("Open")
    private float open;

    @JsonProperty("High")
    private float high;

    @JsonProperty("Low")
    private float low;

    @JsonProperty("Close")
    private float close;

    @JsonProperty("Volume")
    private float volume;

    @JsonProperty("Adj_Close")
    private float adjustedClose;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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
}
