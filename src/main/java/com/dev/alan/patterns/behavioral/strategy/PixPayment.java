package com.dev.alan.patterns.behavioral.strategy;

public class PixPayment implements PaymentStrategy {
    private final String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado com PIX (" + pixKey + ")");
    }
}
