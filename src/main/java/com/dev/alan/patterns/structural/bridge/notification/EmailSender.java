package com.dev.alan.patterns.structural.bridge.notification;

public class EmailSender implements MessageSender {
    @Override
    public String sendMessage(String message) {
        return "Enviando EMAIL: " + message;
    }
}
