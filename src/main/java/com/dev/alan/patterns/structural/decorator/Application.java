package com.dev.alan.patterns.structural.decorator;

public class Application {

    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void executar(){
        this.notifier.send("SOCORRO! SISTEMA FORA");
    }

    public void executar(String message){
        this.notifier.send(message);
    }

    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier  = new SlackNotifier(notifier);
        notifier  = new SMSNotifier(notifier);

        Application app = new Application();
        app.setNotifier(notifier );
        app.executar();
    }
}
