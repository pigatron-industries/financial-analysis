package com.pigatron.finance.client.impl.yahoo;

import com.pigatron.finance.client.AbstractApiClient;
import com.pigatron.finance.client.impl.yahoo.converter.YahooCurrentDataConverter;
import com.pigatron.finance.client.impl.yahoo.converter.YahooHistoricDataConverter;
import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentResponse;
import com.pigatron.finance.client.impl.yahoo.historic.YahooHistoricResponse;
import com.pigatron.finance.data.entity.CurrentData;
import com.pigatron.finance.data.entity.HistoricDayData;
import com.pigatron.finance.data.entity.HistoricRangeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class YahooApiClient extends AbstractApiClient {

    private static final String baseUrl = "http://query.yahooapis.com/v1/public/yql";

    @Autowired
    YahooCurrentDataConverter currentDataConverter;

    @Autowired
    YahooHistoricDataConverter historicDataConverter;


    @Override
    public CurrentData getCurrent(String symbol) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("q", "select * from yahoo.finance.quotes where symbol='" + symbol + "'")
                .queryParam("format", "json")
                .queryParam("env", "store://datatables.org/alltableswithkeys")
                .build();

        YahooCurrentResponse response = restTemplate.getForObject(uri.encode().toUri(), YahooCurrentResponse.class);

        return currentDataConverter.convert(response.getQuery().getResults().getQuote());
    }

    public HistoricRangeData getHistoric(String symbol, LocalDateTime startDate, LocalDateTime endDate) {

        if(endDate == null) {
            endDate = LocalDateTime.now();
        }

        UriComponents uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("q", "select * from yahoo.finance.historicaldata where symbol='" + symbol +
                        "' and startDate='" + formatDate(startDate) +
                        "' and endDate='" + formatDate(endDate) + "'")
                .queryParam("format", "json")
                .queryParam("env", "store://datatables.org/alltableswithkeys")
                .build();

        YahooHistoricResponse response = restTemplate.getForObject(uri.encode().toUri(), YahooHistoricResponse.class);
        List<HistoricDayData> data = response.getQuery().getResults().getQuote().stream()
                .map(historicDataConverter::convert)
                .collect(Collectors.toList());

        return HistoricRangeData.builder()
                .withDayData(data)
                .build();
    }

    private String formatDate(LocalDateTime date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(formatter);
    }


}
