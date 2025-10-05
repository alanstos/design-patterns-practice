package com.dev.alan.patterns.behavioral.memento;

import java.util.Stack;

// Caretaker

public class History {
    private Stack<EditorMemento> history = new Stack<>();

    public void save(EditorMemento memento) {
        history.push(memento);
    }

    public EditorMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
