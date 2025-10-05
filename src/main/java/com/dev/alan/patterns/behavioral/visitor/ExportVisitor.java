package com.dev.alan.patterns.behavioral.visitor;

public class ExportVisitor implements Visitor {

    @Override
    public void visit(TextElement textElement) {
        System.out.println("{ \"type\": \"text\", \"value\": \"" + textElement.getText() + "\" }");
    }

    @Override
    public void visit(ImageElement imageElement) {
        System.out.println("{ \"type\": \"image\", \"path\": \"" + imageElement.getPath() + "\" }");
    }
}
