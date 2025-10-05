package com.dev.alan.patterns.behavioral.visitor;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<DocumentElement> elements = Arrays.asList(
                new TextElement("Ola, mundo!"),
                new ImageElement("logo.png"),
                new TextElement("Fim do documento")
        );

        Visitor renderVisitor = new RenderVisitor();
        Visitor exportVisitor = new ExportVisitor();

        System.out.println("=== Renderizando ===");
        elements.forEach(e -> e.accept(renderVisitor));

        System.out.println("=== Exportando ===");
        elements.forEach(e -> e.accept(exportVisitor));
    }
}
