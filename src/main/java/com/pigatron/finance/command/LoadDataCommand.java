package com.pigatron.finance.command;

import com.pigatron.finance.data.entity.HistoricRangeData;
import com.pigatron.finance.data.service.FinanceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LoadDataCommand implements CommandMarker {

    @Autowired
    private FinanceDataService financeDataService;


    @CliAvailabilityIndicator({"load"})
    public boolean isCommandAvailable() {
        return true;
    }

    @CliCommand(value = "load", help = "Load data command")
    public String load(@CliOption(key = {""}, mandatory = true, help = "Symbol") final String symbol) {

        LocalDateTime startDate = LocalDateTime.now().minusDays(5);

        HistoricRangeData data = financeDataService.getHistoric(symbol, startDate, null);

        System.out.println(data);

        String output = "";
        return output;
    }

}
