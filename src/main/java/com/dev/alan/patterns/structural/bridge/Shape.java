package com.dev.alan.patterns.structural.bridge;

public abstract class Shape {
    protected  Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    abstract String draw();
}
