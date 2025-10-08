package com.dev.alan.exercicio.notificacao.solucao02;

public class SMSDecorator extends  BaseDecorator {
    public SMSDecorator(INotificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void send(String message) {
        super.send(message);

        System.out.println("enviando SMS.. " + message);
    }
}
