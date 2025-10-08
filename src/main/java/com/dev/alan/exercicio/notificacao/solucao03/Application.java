package com.dev.alan.exercicio.notificacao.solucao03;

public class Application {

    public static void main(String[] args) {
        Notificacao notifica = new Notificacao();

        notifica.setNotificaStrategy(new EmailStrategy());
        notifica.envia("compra realizada! parabens");

        notifica.setNotificaStrategy(new SMSStrategy());
        notifica.envia("compra realizada! parabens");
    }
}
