package com.dev.alan.patterns.structural.bridge.notification;

public class ReminderNotification extends Notification {

    public ReminderNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public String notifyUser(String message) {
        return sender.sendMessage("LEMBRETE: " + message);
    }
}
