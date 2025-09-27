package com.dev.alan.patterns.structural.proxy;

//Real Subject

public class RealVideo implements  Video {
    private final String filename;

    public RealVideo(String filename) {
        this.filename = filename;
        loadFromServer();
    }

    private void loadFromServer() {
        System.out.println("Carregando video pesado: " + filename + " do servidor...");
        try {
            Thread.sleep(3000); // simula tempo de carregamento
            System.out.println("finalizado carregamento video ok");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void play() {
        System.out.println("Reproduzindo video: " + filename);
    }
}
