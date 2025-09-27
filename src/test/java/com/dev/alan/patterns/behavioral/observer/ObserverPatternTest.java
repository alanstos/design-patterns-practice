package com.dev.alan.patterns.behavioral.observer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class ObserverPatternTest {

    private TemperatureSensor sensor;
    private Observer display;
    private Observer logger;
    private Observer alarm;

    @BeforeEach
    void setup() {
        sensor = new TemperatureSensor();
        display = Mockito.mock(Observer.class);
        logger = Mockito.mock(Observer.class);
        alarm = Mockito.mock(Observer.class);

        sensor.attach(display);
        sensor.attach(logger);
        sensor.attach(alarm);
    }

    @Test
    void deveNotificarTodosObservers() {
        sensor.setTemperature(28);

        verify(display, times(1)).update(28);
        verify(logger, times(1)).update(28);
        verify(alarm, times(1)).update(28);
    }

    @Test
    void deveNotificarApenasObserversAtuais() {
        sensor.detach(logger);
        sensor.setTemperature(30);

        verify(display, times(1)).update(30);
        verify(logger, never()).update(30);
        verify(alarm, times(1)).update(30);
    }
}
