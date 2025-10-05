package com.dev.alan.patterns.behavioral.visitor.ecommerce;

// Element

public interface Produto {
    void accept(Visitor visitor);
    double getPreco();
}
