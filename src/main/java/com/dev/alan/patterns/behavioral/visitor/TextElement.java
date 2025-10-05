package com.dev.alan.patterns.behavioral.visitor;

public class TextElement implements DocumentElement {
    private final String text;

    public TextElement(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
