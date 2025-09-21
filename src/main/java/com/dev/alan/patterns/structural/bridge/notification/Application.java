package com.dev.alan.patterns.structural.bridge.notification;

public class Application {
    public static void main(String[] args) {
        Notification alert = new AlertNotification(new EmailSender());
        Notification reminder = new ReminderNotification(new SmsSender());

        System.out.println(alert.notifyUser("Servidor fora do ar!"));
        System.out.println(reminder.notifyUser("Reuniao as 15h."));
    }
}
