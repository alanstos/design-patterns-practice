package com.dev.alan.exercicio.dinamicaNotif.order;

public abstract class OrderProcessor {

    public final void processOrder(Order order) {
        validarPedido(order);
        processarPagamento(order);
        enviarNotificacoes(order);

        System.out.println("* Pedido finalizado com sucesso!\n");
    }

    protected void validarPedido(Order order) {
        System.out.println("Validando pedido $" + order.getAmount());
    }

    protected abstract void processarPagamento(Order order);

    protected void enviarNotificacoes(Order order) {
        order.notifyObservers("[NOTIFICACAO] pedido confirmado!");
    }
}
