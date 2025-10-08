package com.dev.alan.exercicio.notificacao.solucao01;

public class Email implements  ICanal {
    @Override
    public void envia() {
        System.out.println("enviando email...");
    }
}
