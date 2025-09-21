package com.dev.alan.patterns.structural.decorator;

public class NotifierDecorator implements  Notifier {

    protected Notifier wrappee;

    NotifierDecorator(Notifier notifier){
        super();
        this.wrappee = notifier;
    }

    @Override
    public String send(String message) {
        return this.wrappee.send(message);
    }
}
