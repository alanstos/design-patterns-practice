package com.dev.alan.patterns.structural.bridge.notification;

public class SmsSender implements MessageSender {
    @Override
    public String sendMessage(String message) {
        return "Enviando SMS: " + message;
    }
}
