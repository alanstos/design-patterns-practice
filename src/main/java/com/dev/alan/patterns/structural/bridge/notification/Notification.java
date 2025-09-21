package com.dev.alan.patterns.structural.bridge.notification;

public abstract class Notification {
    protected MessageSender sender;

    public Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract String notifyUser(String message);
}
