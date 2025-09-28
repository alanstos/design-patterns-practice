package com.dev.alan.patterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado com PayPal (" + email + ")");
    }
}
