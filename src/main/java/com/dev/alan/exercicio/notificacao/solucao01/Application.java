package com.dev.alan.exercicio.notificacao.solucao01;

public class Application {

    public static void main(String[] args) {

        String mensagem = "May day";

        INotificacao notificacao = new Notificacao();

        notificacao.add(new Email());
        notificacao.add(new SMS());

        notificacao.executa(mensagem);
    }
}
