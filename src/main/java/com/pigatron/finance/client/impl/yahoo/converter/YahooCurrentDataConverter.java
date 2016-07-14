package com.pigatron.finance.client.impl.yahoo.converter;


import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentQuote;
import com.pigatron.finance.data.entity.CurrentData;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class YahooCurrentDataConverter implements Converter<YahooCurrentQuote, CurrentData> {

    @Override
    public CurrentData convert(YahooCurrentQuote source) {
        return CurrentData.builder()
                .withLastTradePrice(source.getLastTradePrice())
                .withChange(source.getChange())
                .build();
    }

}
