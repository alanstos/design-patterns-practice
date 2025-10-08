package com.dev.alan.exercicio.notificacao.solucao01;

import java.util.HashSet;
import java.util.Set;

class Notificacao implements INotificacao {

    Set<ICanal> canais = new HashSet<>();
    @Override
    public void executa(String mensagem) {
        System.out.println("notificando todos com mensagem: " + mensagem);
        for (ICanal canal : canais) {
            canal.envia();
        }
    }

    @Override
    public void add(ICanal canal) {
        canais.add(canal);
    }
}
