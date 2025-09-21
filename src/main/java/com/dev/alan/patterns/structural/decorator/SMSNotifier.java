package com.dev.alan.patterns.structural.decorator;

public class SMSNotifier extends   NotifierDecorator {

    SMSNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        this.sendSMS(message);
        return super.send(message);
    }

    private void sendSMS(String message){
        System.out.println("enviando notificacao SMS: " + message);
    }
}
