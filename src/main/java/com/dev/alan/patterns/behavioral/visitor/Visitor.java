package com.dev.alan.patterns.behavioral.visitor;

public interface Visitor {
    void visit(TextElement textElement);
    void visit(ImageElement imageElement);
}
