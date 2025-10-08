package com.dev.alan.exercicio.notificacao.solucao01;

interface INotificacao {

    void executa(String mensagem);

    void add(ICanal canal);
}
