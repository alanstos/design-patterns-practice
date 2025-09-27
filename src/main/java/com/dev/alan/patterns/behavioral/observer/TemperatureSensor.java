package com.dev.alan.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor implements Subject {

    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    public TemperatureSensor(int temperatura) {
        this.temperature = temperatura;
    }

    public TemperatureSensor() {}

    public void trocaTemperatura(int temperatura){
        this.setTemperature(temperatura);
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
