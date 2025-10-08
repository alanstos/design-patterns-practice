package com.dev.alan.exercicio.notificacao.solucao02;

public class WhatsappDecorator extends BaseDecorator {
    public WhatsappDecorator(INotificacao inotificacao) {
        super(inotificacao);
    }

    @Override
    public void send(String message) {
        super.send(message);

        System.out.println("enviando zapzap com " + message);
    }
}
