package com.pigatron.finance.command;

import org.springframework.shell.core.CommandMarker;
import org.springframework.shell.core.annotation.CliAvailabilityIndicator;
import org.springframework.shell.core.annotation.CliCommand;
import org.springframework.shell.core.annotation.CliOption;
import org.springframework.stereotype.Component;

@Component
public class EchoCommand implements CommandMarker {

    @CliAvailabilityIndicator({"echo"})
    public boolean isCommandAvailable() {
        return true;
    }

    @CliCommand(value = "echo", help = "Echo command")
    public String test(@CliOption(key = {""}, mandatory = false, help = "Echo command") final String message) {
        return message;
    }

}
