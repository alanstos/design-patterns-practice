package com.dev.alan.patterns.behavioral.state;

//status do pedido pago

public class PaidOrderState implements OrderState {
    @Override
    public void next(OrderContext context) {
        context.setState(new ShippedOrderState());
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new NewOrderState());
    }

    @Override
    public String getStatus() {
        return "Pago";
    }
}
