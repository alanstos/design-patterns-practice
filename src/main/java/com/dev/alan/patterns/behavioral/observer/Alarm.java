package com.dev.alan.patterns.behavioral.observer;

public class Alarm implements  Observer{
    private final int threshold;

    public Alarm(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public void update(int temperature) {
        if (temperature > threshold) {
            System.out.println("ALERTA! Temperatura acima do limite " + threshold + " : " + temperature);
        } else {
            System.out.println("Alarme desligado! Temperatura OK!");
        }
    }
}
