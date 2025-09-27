package com.dev.alan.patterns.behavioral.command;

public class FanOnCommand implements Command {
    private final Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.on();
    }
}
