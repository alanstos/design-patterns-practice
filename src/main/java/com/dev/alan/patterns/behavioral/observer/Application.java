package com.dev.alan.patterns.behavioral.observer;

public class Application {

    public static void main(String[] args) {
        Observer display = new Display();
        Observer logger = new Logger();
        Observer alarm = new Alarm(40);

        TemperatureSensor sensor = new TemperatureSensor(20);

        sensor.attach(display);
        sensor.attach(logger);
        sensor.attach(alarm);

        sensor.trocaTemperatura(42);
        sensor.trocaTemperatura(30);
    }
}
