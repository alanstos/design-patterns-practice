package com.dev.alan.patterns.structural.bridge.notification;

public class AlertNotification extends Notification {

    public AlertNotification(MessageSender sender) {
        super(sender);
    }

    @Override
    public String notifyUser(String message) {
        return sender.sendMessage("ALERTA: " + message);
    }
}
