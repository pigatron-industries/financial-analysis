package com.pigatron.finance.command;

import com.pigatron.finance.data.entity.CurrentData;
import com.pigatron.finance.data.service.FinanceDataService;
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

    @CliCommand(value = "quote", help = "CurrentData command")
    public String quote(@CliOption(key = {""}, mandatory = true, help = "Symbol") final String symbol) {
        CurrentData quote = financeDataService.getQuote(symbol);

        String output = "";
        //output += quote.getName() + " (" + quote.getSymbol() + ")\n";
        output += "Last Trade Price: " + quote.getLastTradePrice() + "\n";
        output += "Change: " + quote.getChange() + "\n";
        return output;
    }

}
