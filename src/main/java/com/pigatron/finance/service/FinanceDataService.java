package com.pigatron.finance.service;

import com.pigatron.finance.client.DataApiClient;
import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceDataService {

    @Autowired
    private DataApiClient dataApiClient;


    public YahooCurrentQuote getQuote(String symbol) {
        YahooCurrentQuote quote = dataApiClient.getCurrent(symbol);
        return quote;
    }

}
