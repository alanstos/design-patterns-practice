package com.dev.alan.patterns.behavioral.strategy;

public class CreditCardPayment implements  PaymentStrategy{
    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$" + amount + " realizado com Cartao de Credito (" + cardNumber + ")");
    }
}
