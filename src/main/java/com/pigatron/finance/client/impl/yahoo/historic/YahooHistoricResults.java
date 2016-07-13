package com.pigatron.finance.client.impl.yahoo.historic;



import java.util.List;

public class YahooHistoricResults {

    private List<YahooHistoricQuote> quote;

    public List<YahooHistoricQuote> getQuote() {
        return quote;
    }

    public void setQuote(List<YahooHistoricQuote> quote) {
        this.quote = quote;
    }
}
