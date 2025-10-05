package com.dev.alan.patterns.behavioral.visitor.ecommerce;

public interface Visitor {
    void visit(Livro livro);
    void visit(Eletronico eletronico);
    void visit(Comida comida);
}
