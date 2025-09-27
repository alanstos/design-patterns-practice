package com.dev.alan.patterns.structural.flyweight;

public class TreeTypeImpl implements TreeType {
    private final String name;
    private final String color;
    private final String texture;

    public TreeTypeImpl(String name, String color, String texture) {
        System.out.println("**** NEW TreeTypeImpl " + name);
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    @Override
    public void draw(int x, int y) {
        System.out.printf("Desenhando arvore [%s, %s, %s] na posicao (%d, %d)%n",
                name, color, texture, x, y);
    }
}
