package com.dev.alan.patterns.behavioral.strategy;

//CLIENT

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double amount){
        if (paymentStrategy == null) {
            throw new IllegalStateException("Nenhuma forma de pagamento definida!");
        }
        this.paymentStrategy.pay(amount);
    }
}
