package com.pigatron.finance.data.service;

import com.pigatron.finance.client.DataApiClient;
import com.pigatron.finance.data.entity.CurrentData;
import com.pigatron.finance.data.entity.HistoricRangeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FinanceDataService {

    @Autowired
    private DataApiClient dataApiClient;


    public CurrentData getQuote(String symbol) {
        CurrentData quote = dataApiClient.getCurrent(symbol);
        return quote;
    }

    public HistoricRangeData getHistoric(String symbol, LocalDateTime startDate, LocalDateTime endDate) {
        HistoricRangeData data = dataApiClient.getHistoric(symbol, startDate, endDate);
        return data;
    }

}
