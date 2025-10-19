package com.dev.alan.exercicio.dinamicaNotif.order;

public class OnlineOrderProcessor extends  OrderProcessor{
    @Override
    protected void processarPagamento(Order order) {
        order.getPaymentStrategy().pay(order.getAmount());
    }
}
