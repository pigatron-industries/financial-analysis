package com.pigatron.finance.client.impl.yahoo;

import com.pigatron.finance.client.AbstractApiClient;
import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentQuote;
import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentResponse;
import com.pigatron.finance.client.impl.yahoo.historic.YahooHistoricQuote;
import com.pigatron.finance.client.impl.yahoo.historic.YahooHistoricResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;


@Component
public class YahooApiClient extends AbstractApiClient {

    private static final String baseUrl = "http://query.yahooapis.com/v1/public/yql";

    @Override
    public YahooCurrentQuote getCurrent(String symbol) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("q", "select * from yahoo.finance.quotes where symbol='" + symbol + "'")
                .queryParam("format", "json")
                .queryParam("env", "store://datatables.org/alltableswithkeys")
                .build();

        System.out.println(uri.toString());

        YahooCurrentResponse response = restTemplate.getForObject(uri.encode().toUri(), YahooCurrentResponse.class);
        return response.getQuery().getResults().getQuote();
    }

    public List<YahooHistoricQuote> getHistoric(String symbol) {
        UriComponents uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .queryParam("q", "select * from yahoo.finance.historicaldata where symbol='" + symbol + "' and startDate='2009-09-11' and endDate='2010-03-10'")
                .queryParam("format", "json")
                .queryParam("env", "store://datatables.org/alltableswithkeys")
                .build();

        System.out.println(uri.toString());

        YahooHistoricResponse response = restTemplate.getForObject(uri.encode().toUri(), YahooHistoricResponse.class);
        return response.getQuery().getResults().getQuote();
    }


}
