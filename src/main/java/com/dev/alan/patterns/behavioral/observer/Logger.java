package com.dev.alan.patterns.behavioral.observer;

public class Logger implements  Observer{
    @Override
    public void update(int temperature) {
        System.out.println("Logger: Registrando temperatura = " + temperature);
    }
}
