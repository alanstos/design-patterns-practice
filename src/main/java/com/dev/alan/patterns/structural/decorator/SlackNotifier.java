package com.dev.alan.patterns.structural.decorator;

public class SlackNotifier extends   NotifierDecorator {

    SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        this.sendSlack(message);
        return super.send(message);
    }

    private void sendSlack(String message){
        System.out.println("enviando notificacao SLACK: " + message);
    }
}
