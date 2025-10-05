package com.dev.alan.patterns.behavioral.visitor.ecommerce;

public class Livro implements Produto {
    private final double preco;

    public Livro(double preco) {
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
