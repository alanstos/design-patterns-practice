package com.dev.alan.exercicio.jokenpo.solucao01;

public class Application {

    public static void main(String[] args) {

        Jogada jogador1 = new Jogada("pedra", "tesoura");
        Jogada jogador2 = new Jogada("papel", "pedra");

        Jogo jogo = new Jogo(jogador1, jogador2);
        jogo.jogar();

        System.out.println("Resultado jogador 1 " + jogador1.getResultado() );
        System.out.println("Resultado jogador 2 " + jogador2.getResultado() );
    }
}
