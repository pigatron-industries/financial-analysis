package com.pigatron.finance.client.impl.yahoo.converter;


import com.pigatron.finance.client.impl.yahoo.historic.YahooHistoricQuote;
import com.pigatron.finance.data.entity.HistoricDayData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class YahooHistoricDataConverter implements Converter<YahooHistoricQuote, HistoricDayData> {

    @Override
    public HistoricDayData convert(YahooHistoricQuote source) {
        return HistoricDayData.builder()
                .withDate(source.getDate())
                .withOpen(source.getOpen())
                .withClose(source.getClose())
                .withHigh(source.getHigh())
                .withLow(source.getLow())
                .withVolume(source.getVolume())
                .withAdjustedClose(source.getAdjustedClose())
                .build();
    }
}
