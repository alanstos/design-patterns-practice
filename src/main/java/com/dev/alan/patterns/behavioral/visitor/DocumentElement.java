package com.dev.alan.patterns.behavioral.visitor;

public interface DocumentElement {
    void accept(Visitor visitor);
}
