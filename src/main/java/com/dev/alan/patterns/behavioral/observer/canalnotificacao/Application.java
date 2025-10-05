package com.dev.alan.patterns.behavioral.observer.canalnotificacao;

public class Application {

    public static void main(String[] args) {
        CanalNoticias canal = new CanalNoticias();

        Usuario u1 = new Usuario("Alice");
        Usuario u2 = new Usuario("Bob");

        canal.addObserver(u1);
        canal.addObserver(u2);

        canal.publicarNoticia("Novo padrao de design lancado!");
        canal.publicarNoticia("Observer Pattern explicado com exemplo!");
    }
}
