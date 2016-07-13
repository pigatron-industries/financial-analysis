package com.pigatron.finance.client.impl.yahoo.current;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YahooCurrentQuote {

    @JsonProperty("Symbol")
    private String symbol;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("LastTradePriceOnly")
    private String lastTradePrice;

    @JsonProperty("FiftydayMovingAverage")
    private String fiftydayMovingAverage;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastTradePrice() {
        return lastTradePrice;
    }

    public void setLastTradePrice(String lastTradePrice) {
        this.lastTradePrice = lastTradePrice;
    }

    public String getFiftydayMovingAverage() {
        return fiftydayMovingAverage;
    }

    public void setFiftydayMovingAverage(String fiftydayMovingAverage) {
        this.fiftydayMovingAverage = fiftydayMovingAverage;
    }
}
