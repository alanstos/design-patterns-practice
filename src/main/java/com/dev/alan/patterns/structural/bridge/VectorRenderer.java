package com.dev.alan.patterns.structural.bridge;

public class VectorRenderer implements Renderer {
    @Override
    public String renderShape(String shape) {
        return "desenha [" + shape  + "] em estilo vetor.";
    }
}
