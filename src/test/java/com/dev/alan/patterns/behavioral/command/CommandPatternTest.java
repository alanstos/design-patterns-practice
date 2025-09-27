package com.dev.alan.patterns.behavioral.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class CommandPatternTest {

    private Light light;
    private Fan fan;
    private RemoteControl remote;

    @BeforeEach
    void setup() {
        light = Mockito.mock(Light.class);
        fan = Mockito.mock(Fan.class);
        remote = new RemoteControl();
    }

    @Test
    void deveLigarELuz() {
        Command lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        remote.pressButton();

        verify(light, times(1)).on();
        verify(light, never()).off();
    }

    @Test
    void deveDesligarALuz() {
        Command lightOff = new LightOffCommand(light);
        remote.setCommand(lightOff);
        remote.pressButton();

        verify(light, times(1)).off();
        verify(light, never()).on();
    }

    @Test
    void deveLigarOVentilador() {
        Command fanOn = new FanOnCommand(fan);
        remote.setCommand(fanOn);
        remote.pressButton();

        verify(fan, times(1)).on();
        verify(fan, never()).off();
    }

    @Test
    void deveDesligarOVentilador() {
        Command fanOff = new FanOffCommand(fan);
        remote.setCommand(fanOff);
        remote.pressButton();

        verify(fan, times(1)).off();
        verify(fan, never()).on();
    }
}
