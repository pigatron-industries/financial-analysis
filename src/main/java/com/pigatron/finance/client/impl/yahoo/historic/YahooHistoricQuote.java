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

    //TODO Add fields
//    "Symbol": "AAPL",
//            "Date": "2010-03-10",
//            "Open": "223.829996",
//            "High": "225.480007",
//            "Low": "223.199995",
//            "Close": "224.839993",
//            "Volume": "149054500",
//            "Adj_Close": "29.565976"

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
