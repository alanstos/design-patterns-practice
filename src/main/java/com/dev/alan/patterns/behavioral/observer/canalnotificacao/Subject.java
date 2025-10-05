package com.dev.alan.patterns.behavioral.observer.canalnotificacao;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String noticia);
}
