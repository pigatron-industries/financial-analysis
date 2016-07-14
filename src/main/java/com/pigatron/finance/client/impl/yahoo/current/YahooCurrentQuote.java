package com.pigatron.finance.client.impl.yahoo.current;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YahooCurrentQuote {

    @JsonProperty("Symbol")
    private String symbol;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("LastTradePriceOnly")
    private float lastTradePrice;

    @JsonProperty("Change")
    private float change;

    @JsonProperty("FiftydayMovingAverage")
    private float fiftydayMovingAverage;

//            "Ask": "3733.00",
//            "AverageDailyVolume": "241106",
//            "Bid": "3728.00",
//            "AskRealtime": null,
//            "BidRealtime": null,
//            "BookValue": "0.07",
//            "Change_PercentChange": "+16.00 - +0.43%",
//            "Change": "+16.00",
//            "Commission": null,
//            "Currency": "GBp",
//            "ChangeRealtime": null,
//            "AfterHoursChangeRealtime": null,
//            "DividendShare": null,
//            "LastTradeDate": "7/13/2016",
//            "TradeDate": null,
//            "EarningsShare": "112.70",
//            "ErrorIndicationreturnedforsymbolchangedinvalid": null,
//            "EPSEstimateCurrentYear": "133.11",
//            "EPSEstimateNextYear": null,
//            "EPSEstimateNextQuarter": "0.00",
//            "DaysLow": "3716.00",
//            "DaysHigh": "3800.23",
//            "YearLow": "3159.00",
//            "YearHigh": "4280.00",
//            "HoldingsGainPercent": null,
//            "AnnualizedGain": null,
//            "HoldingsGain": null,
//            "HoldingsGainPercentRealtime": null,
//            "HoldingsGainRealtime": null,
//            "MoreInfo": null,
//            "OrderBookRealtime": null,
//            "MarketCapitalization": "3.54B",
//            "MarketCapRealtime": null,
//            "EBITDA": "138.11M",
//            "ChangeFromYearLow": "572.00",
//            "PercentChangeFromYearLow": "+18.11%",
//            "LastTradeRealtimeWithTime": null,
//            "ChangePercentRealtime": null,
//            "ChangeFromYearHigh": "-549.00",
//            "PercebtChangeFromYearHigh": "-12.83%",
//            "LastTradeWithTime": "8:47am - <b>3731.00</b>",
//            "LastTradePriceOnly": "3731.00",
//            "HighLimit": null,
//            "LowLimit": null,
//            "DaysRange": "3716.00 - 3800.23",
//            "DaysRangeRealtime": null,
//            "FiftydayMovingAverage": "3933.84",
//            "TwoHundreddayMovingAverage": "3930.40",
//            "ChangeFromTwoHundreddayMovingAverage": "-199.40",
//            "PercentChangeFromTwoHundreddayMovingAverage": "-5.07%",
//            "ChangeFromFiftydayMovingAverage": "-202.84",
//            "PercentChangeFromFiftydayMovingAverage": "-5.16%",
//            "Name": "RIGHTMOVE",
//            "Notes": null,
//            "Open": "3718.00",
//            "PreviousClose": "3715.00",
//            "PricePaid": null,
//            "ChangeinPercent": "+0.43%",
//            "PriceSales": "1836.82",
//            "PriceBook": "53071.43",
//            "ExDividendDate": "5/5/2016",
//            "PERatio": "33.11",
//            "DividendPayDate": null,
//            "PERatioRealtime": null,
//            "PEGRatio": "1.85",
//            "PriceEPSEstimateCurrentYear": "28.03",
//            "PriceEPSEstimateNextYear": "24.86",
//            "Symbol": "RMV.L",
//            "SharesOwned": null,
//            "ShortRatio": "0.00",
//            "LastTradeTime": "8:47am",
//            "TickerTrend": null,
//            "OneyrTargetPrice": null,
//            "Volume": "12360",
//            "HoldingsValue": null,
//            "HoldingsValueRealtime": null,
//            "YearRange": "3159.00 - 4280.00",
//            "DaysValueChange": null,
//            "DaysValueChangeRealtime": null,
//            "StockExchange": "LSE",
//            "DividendYield": null,
//            "PercentChange": "+0.43%"


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

    public float getFiftydayMovingAverage() {
        return fiftydayMovingAverage;
    }

    public void setFiftydayMovingAverage(float fiftydayMovingAverage) {
        this.fiftydayMovingAverage = fiftydayMovingAverage;
    }
}
