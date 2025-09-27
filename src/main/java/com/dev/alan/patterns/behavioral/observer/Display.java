package com.dev.alan.patterns.behavioral.observer;

public class Display implements  Observer {
    @Override
    public void update(int temperature) {
        System.out.println("Display: Temperatura atual = " + temperature);
    }
}
