package com.dev.alan.patterns.behavioral.observer.canalnotificacao;

import java.util.ArrayList;
import java.util.List;

public class CanalNoticias implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String noticia) {
        for (Observer o : observers) {
            o.update(noticia);
        }
    }

    public void publicarNoticia(String noticia) {
        System.out.println("** Publicando: " + noticia);
        notifyObservers(noticia);
    }
}
