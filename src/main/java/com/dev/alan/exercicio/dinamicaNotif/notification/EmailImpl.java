package com.dev.alan.exercicio.dinamicaNotif.notification;

public class EmailImpl implements INotificationObserver {
    @Override
    public void update(String message) {
        System.out.println("[NOTIFICACAO] enviando email " + message);
    }
}
