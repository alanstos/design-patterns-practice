package com.dev.alan.patterns.behavioral.state;

//status enviada

public class ShippedOrderState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new DeliveredOrderState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new PaidOrderState());
    }

    @Override
    public String getStatus() {
        return "Enviado";
    }
}
