package com.dev.alan.exercicio.notificacao.solucao02;

public class Main {

    public static void main(String[] args) {
        String message = "Compra realizada";

        INotificacao notificacao = new BaseDecorator(null);
        notificacao = new EmailDecorator(notificacao);
        notificacao = new SMSDecorator(notificacao);
        notificacao = new WhatsappDecorator(notificacao);

        notificacao.send(message);
    }
}
