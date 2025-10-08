package com.dev.alan.exercicio.notificacao.solucao03;

public class EmailStrategy implements INotificaStrategy {
    @Override
    public void send(String message) {
        System.out.println("enviando email " + message);
    }
}
