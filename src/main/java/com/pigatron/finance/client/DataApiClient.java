package com.pigatron.finance.client;

import com.pigatron.finance.data.entity.CurrentData;
import com.pigatron.finance.data.entity.HistoricRangeData;

import java.time.LocalDateTime;

public interface DataApiClient {

    CurrentData getCurrent(String symbol);

    HistoricRangeData getHistoric(String symbol, LocalDateTime startDate, LocalDateTime endDate);

}
