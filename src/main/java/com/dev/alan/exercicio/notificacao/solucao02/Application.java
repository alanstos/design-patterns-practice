package com.dev.alan.exercicio.notificacao.solucao02;

public class Application {

    INotificacao notificacao;

    void setNotificacao(INotificacao notificacao){
        this.notificacao = notificacao;
    }

    void fazAMagicaSend(String message){
        this.notificacao.send(message);
    }

    public static void main(String[] args) {
        String message = "Compra realizada";

        INotificacao notificacao = new BaseDecorator();
        notificacao = new EmailDecorator(notificacao);
        notificacao = new SMSDecorator(notificacao);
        notificacao = new WhatsappDecorator(notificacao);

        Application app = new Application();
        app.setNotificacao(notificacao);
        app.fazAMagicaSend(message);
    }
}
