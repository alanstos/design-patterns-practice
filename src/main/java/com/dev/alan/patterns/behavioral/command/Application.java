package com.dev.alan.patterns.behavioral.command;

public class Application {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);
        Command fanOff = new FanOffCommand(ceilingFan);

        // Ligar luz
        remote.setCommand(lightOn);
        remote.pressButton();

        // Desligar luz
        remote.setCommand(lightOff);
        remote.pressButton();

        // Ligar ventilador
        remote.setCommand(fanOn);
        remote.pressButton();

        // Desligar ventilador
        remote.setCommand(fanOff);
        remote.pressButton();
    }
}
