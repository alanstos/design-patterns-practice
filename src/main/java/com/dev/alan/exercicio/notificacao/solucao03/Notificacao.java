package com.dev.alan.exercicio.notificacao.solucao03;

public class Notificacao {

    INotificaStrategy notificaStrategy;

    public void setNotificaStrategy(INotificaStrategy notificaStrategy) {
        this.notificaStrategy = notificaStrategy;
    }


    public void envia(String message) {
        this.notificaStrategy.send(message);
    }
}
