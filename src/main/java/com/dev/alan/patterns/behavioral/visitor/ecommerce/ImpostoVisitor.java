package com.dev.alan.patterns.behavioral.visitor.ecommerce;

public class ImpostoVisitor implements Visitor {

    @Override
    public void visit(Livro livro) {
        double imposto = livro.getPreco() * 0.05;
        System.out.println("Imposto sobre livro: " + imposto);
    }

    @Override
    public void visit(Eletronico eletronico) {
        double imposto = eletronico.getPreco() * 0.20;
        System.out.println("Imposto sobre eletronico: " + imposto);
    }

    @Override
    public void visit(Comida comida) {
        double imposto = comida.getPreco() * 0.10;
        System.out.println("Imposto sobre comida: " + imposto);
    }
}
