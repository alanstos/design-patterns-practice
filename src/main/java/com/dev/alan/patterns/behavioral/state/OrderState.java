package com.dev.alan.patterns.behavioral.state;

public interface OrderState {
    void next(OrderContext context);
    void prev(OrderContext context);
    String getStatus();
}
