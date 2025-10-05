package com.dev.alan.patterns.behavioral.memento;

public class Application {

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Ola");
        editor.type("mundo");
        history.save(editor.save());

        editor.type("!!!");
        System.out.println("Conteudo atual: " + editor.getContent());

        editor.restore(history.undo());
        System.out.println("Depois do undo: " + editor.getContent());
    }
}
