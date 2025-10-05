package com.dev.alan.patterns.behavioral.visitor.ecommerce;

public class Eletronico implements Produto {
    private final double preco;

    public Eletronico(double preco) {
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
