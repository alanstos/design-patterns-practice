package com.dev.alan.patterns.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BridgeTest {

    @Test
    public void testSimples(){
        Shape shape = new Square(new VectorRenderer());
        String draw = shape.draw();

        assertTrue(draw.contains("QUADRADO"), "desenho quadrado");
        assertTrue(draw.contains("vetor"), "desenho estilo vetor");
    }

    @Test
    void testCircleWithVectorRenderer() {
        Shape circle = new Circle(new VectorRenderer());
        String result = circle.draw();
        assertTrue(result.contains("CIRCULO"));
        assertTrue(result.contains("vetor"));
    }

    @Test
    void testSquareWithRasterRenderer() {
        Shape square = new Square(new RasterRenderer());
        String result = square.draw();
        assertTrue(result.contains("QUADRADO"));
        assertTrue(result.contains("pixels"));
    }
}
