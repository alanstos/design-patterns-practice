package com.dev.alan.patterns.behavioral.visitor;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

class VisitorTest {

    @Test
    void testVisitorComTextElement() {
        Visitor visitor = Mockito.mock(Visitor.class);
        TextElement text = new TextElement("Teste");

        text.accept(visitor);

        verify(visitor).visit(text);
    }

    @Test
    void testVisitorComImageElement() {
        Visitor visitor = Mockito.mock(Visitor.class);
        ImageElement image = new ImageElement("imagem.png");

        image.accept(visitor);

        verify(visitor).visit(image);
    }
}
