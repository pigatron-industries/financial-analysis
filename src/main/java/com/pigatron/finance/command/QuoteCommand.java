package com.pigatron.finance.command;

import com.pigatron.finance.client.impl.yahoo.current.YahooCurrentQuote;
import com.pigatron.finance.service.FinanceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class QuoteCommand implements CommandMarker {

    @Autowired
    private FinanceDataService financeDataService;


    @CliAvailabilityIndicator({"quote"})
    public boolean isCommandAvailable() {
        return true;
    }

    @CliCommand(value = "quote", help = "Quote command")
    public String quote(@CliOption(key = {""}, mandatory = true, help = "Symbol") final String symbol) {
        YahooCurrentQuote quote = financeDataService.getQuote(symbol);

        String output = quote.getName() + " (" + quote.getSymbol() + ")\n";
        output += "Last Trade Price: " + quote.getLastTradePrice() + "\n";
        output += "Fifty day moving average: " + quote.getFiftydayMovingAverage() + "\n";
        return output;
    }

}
