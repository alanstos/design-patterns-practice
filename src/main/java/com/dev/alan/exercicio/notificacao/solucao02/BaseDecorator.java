package com.dev.alan.exercicio.notificacao.solucao02;

class BaseDecorator implements  INotificacao {

    protected INotificacao wrappee;

    BaseDecorator(INotificacao iNotificacao){
        this.wrappee = iNotificacao;
    }

    BaseDecorator(){
        this.wrappee = null;
    }

    @Override
    public void send(String message) {
        if (this.wrappee == null){
            return;
        }
        this.wrappee.send(message);
    }
}
