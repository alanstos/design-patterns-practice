package com.dev.alan.patterns.behavioral.memento;

// Originator

public class TextEditor {
    private String content;

    public void type(String words) {
        this.content = (this.content == null ? "" : this.content + " ") + words;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }
}
