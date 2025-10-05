package com.dev.alan.patterns.behavioral.observer.canalnotificacao;

public class Usuario implements Observer {
    private final String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String noticia) {
        System.out.println(nome + " recebeu a noticia: " + noticia);
    }
}
