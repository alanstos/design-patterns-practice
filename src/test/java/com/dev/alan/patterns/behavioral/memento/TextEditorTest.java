package com.dev.alan.patterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextEditorTest {

    @Test
    void testUndo() {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Primeira frase");
        history.save(editor.save());

        editor.type("Segunda frase");
        assertEquals("Primeira frase Segunda frase", editor.getContent());

        editor.restore(history.undo());
        assertEquals("Primeira frase", editor.getContent());
    }
}
