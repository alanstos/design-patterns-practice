package com.dev.alan.exercicio.jokenpo.solucao01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jogada {
    private final String nome;
    private final Set<String> vence;
    private Resultado resultado;

    public Jogada(String nome, Set<String> vence) {
        this.nome = nome;
        this.vence = vence;
    }

    public Jogada(String nome, String... venceArray) {
        this.nome = nome;
        this.vence = new HashSet(List.of(venceArray));
    }

    public String getNome() {
        return nome;
    }

    public Set<String> getVence() {
        return vence;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public Resultado getResultado() {
        return resultado;
    }
}
