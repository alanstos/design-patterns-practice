package com.dev.alan.patterns.structural.bridge;

public class Application {

    public void criaDesenhos(){
        Shape shape1 = new Circle(new VectorRenderer());
        Shape shape2 = new Square(new RasterRenderer());

        System.out.println("shape1=" +shape1.draw());
        System.out.println("shape2=" +shape2.draw());
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.criaDesenhos();
    }
}
