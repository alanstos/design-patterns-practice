package com.dev.alan.patterns.behavioral.visitor;

public class RenderVisitor implements Visitor {

    @Override
    public void visit(TextElement textElement) {
        System.out.println("Renderizando texto: " + textElement.getText());
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("Renderizando imagem: " + imageElement.getPath());
    }
}
