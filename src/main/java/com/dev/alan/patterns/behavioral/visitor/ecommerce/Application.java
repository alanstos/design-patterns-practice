package com.dev.alan.patterns.behavioral.visitor.ecommerce;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Livro(50.0),
                new Eletronico(2000.0),
                new Comida(30.0)
        );

        Visitor impostoVisitor = new ImpostoVisitor();

        for (Produto p : produtos) {
            p.accept(impostoVisitor);
        }
    }
}
