package com.dev.alan.patterns.structural.decorator;

public class EmailNotifier implements  Notifier {
    @Override
    public String send(String message) {
        System.out.println("enviando notificacao EMAIL: " + message );
        return "EMAIL";
    }
}
