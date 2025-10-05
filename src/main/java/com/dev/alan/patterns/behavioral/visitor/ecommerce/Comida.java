package com.dev.alan.patterns.behavioral.visitor.ecommerce;

public class Comida implements Produto {
    private final double preco;

    public Comida(double preco) {
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
