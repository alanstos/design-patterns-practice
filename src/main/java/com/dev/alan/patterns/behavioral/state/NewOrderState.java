package com.dev.alan.patterns.behavioral.state;

//status novo

public class NewOrderState implements  OrderState{
    @Override
    public void next(OrderContext context) {
        context.setState(new PaidOrderState());
    }

    @Override
    public void prev(OrderContext context) {
        System.out.println("O pedido está no estado inicial, não pode voltar.");
    }

    @Override
    public String getStatus() {
        return "Novo";
    }
}
