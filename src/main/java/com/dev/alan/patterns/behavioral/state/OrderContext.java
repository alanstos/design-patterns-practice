package com.dev.alan.patterns.behavioral.state;

//contexto do pedido

public class OrderContext {

    private OrderState state;

    public OrderContext() {
        this.state = new NewOrderState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public String getStatus() {
        return state.getStatus();
    }
}
