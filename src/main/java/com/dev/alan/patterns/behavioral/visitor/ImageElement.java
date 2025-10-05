package com.dev.alan.patterns.behavioral.visitor;

public class ImageElement implements DocumentElement {
    private final String path;

    public ImageElement(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
