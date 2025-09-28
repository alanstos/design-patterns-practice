package com.dev.alan.patterns.behavioral.state;

//status entregue

public class DeliveredOrderState implements OrderState {
    @Override
    public void next(OrderContext context) {
        System.out.println("O pedido ja foi entregue. Nao ha proximo estado.");
    }

    @Override
    public void prev(OrderContext context) {
        context.setState(new ShippedOrderState());
    }

    @Override
    public String getStatus() {
        return "Entregue";
    }
}
