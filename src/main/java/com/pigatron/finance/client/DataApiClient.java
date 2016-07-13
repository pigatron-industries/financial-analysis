package com.pigatron.finance.client;

import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentQuote;

public interface DataApiClient {

    public YahooCurrentQuote getCurrent(String symbol);

}
