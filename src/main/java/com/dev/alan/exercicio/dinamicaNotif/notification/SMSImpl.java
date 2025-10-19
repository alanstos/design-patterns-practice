package com.dev.alan.exercicio.dinamicaNotif.notification;

public class SMSImpl implements INotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("[NOTIFICACAO] enviando SMS " + message);
    }
}
