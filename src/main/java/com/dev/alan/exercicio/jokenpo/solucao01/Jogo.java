package com.dev.alan.exercicio.jokenpo.solucao01;

public class Jogo {
    private final Jogada jogador1;
    private final Jogada jogador2;

    public Jogo(Jogada jogador1, Jogada jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void jogar() {
        if (jogador1.getNome().equalsIgnoreCase(jogador2.getNome())){
            jogador1.setResultado(Resultado.EMPATE);
            jogador2.setResultado(Resultado.EMPATE);
            return;
        }
        if (jogador1.getVence().contains(jogador2.getNome())){
            jogador1.setResultado(Resultado.VENCEDOR);
            jogador2.setResultado(Resultado.PERDEDOR);
            return;
        }
        jogador1.setResultado(Resultado.PERDEDOR);
        jogador2.setResultado(Resultado.VENCEDOR);
    }
}
