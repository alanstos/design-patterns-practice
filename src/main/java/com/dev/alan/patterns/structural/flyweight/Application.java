package com.dev.alan.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Client

public class Application {
    private final List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

    public static void main(String[] args) {
        Application forest = new Application();

        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            forest.plantTree(rand.nextInt(100), rand.nextInt(100),
                    "Carvalho", "Verde", "Textura1");
        }

        for (int i = 0; i < 5; i++) {
            forest.plantTree(rand.nextInt(100), rand.nextInt(100),
                    "Pinheiro", "Verde Escuro", "Textura2");
        }

        forest.draw();
    }
}
