package com.dev.alan.patterns.structural.bridge;

public class Square extends  Shape{

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    String draw() {
        return this.renderer.renderShape("QUADRADO");
    }
}
