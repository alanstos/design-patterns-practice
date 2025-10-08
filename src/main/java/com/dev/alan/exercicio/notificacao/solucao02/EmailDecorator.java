package com.dev.alan.exercicio.notificacao.solucao02;

public class EmailDecorator extends  BaseDecorator {

    public EmailDecorator(INotificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void send(String message) {
        super.send(message);

        System.out.println("enviando email......." + message);
    }
}
