package com.dev.alan.exercicio.notificacao.solucao01;

public class SMS implements ICanal {
    @Override
    public void envia() {
        System.out.println("enviando SMS..");
    }
}
