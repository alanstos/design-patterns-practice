package com.dev.alan.patterns.structural.proxy;

public class Application {

    public static void main(String[] args) {
        Video video1 = new ProxyVideo("filme_acao.mp4");
        Video video2 = new ProxyVideo("documentario.mp4");

        System.out.println("Videos criados, mas ainda nao carregados!");

        System.out.println("\nUsuario decide assistir o primeiro video:");
        video1.play();

        System.out.println("\nUsuario decide assistir o mesmo video novamente:");
        video1.play();

        System.out.println("\nUsuario decide assistir o segundo video:");
        video2.play();
    }
}
