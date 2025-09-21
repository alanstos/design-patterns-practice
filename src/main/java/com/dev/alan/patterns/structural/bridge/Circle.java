package com.dev.alan.patterns.structural.bridge;

public class Circle extends  Shape{

    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    String draw() {
        return this.renderer.renderShape("CIRCULO");
    }
}
