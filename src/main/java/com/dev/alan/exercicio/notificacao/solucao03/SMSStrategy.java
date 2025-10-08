package com.dev.alan.exercicio.notificacao.solucao03;

public class SMSStrategy implements INotificaStrategy {
    @Override
    public void send(String message) {
        System.out.println("enviando SMS " + message);
    }
}
