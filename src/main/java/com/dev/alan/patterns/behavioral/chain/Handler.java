package com.dev.alan.patterns.behavioral.chain;

// Handler (abstract)

public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(SupportRequest request) {
        if (canHandle(request)) {
            process(request);
            return;
        }

        if (next != null) {
            next.handle(request);
            return;
        }

        System.out.println("Nenhum suporte disponivel para: " + request.getType());
    }

    protected abstract boolean canHandle(SupportRequest request);
    protected abstract void process(SupportRequest request);
}
