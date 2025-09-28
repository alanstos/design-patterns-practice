package com.dev.alan.patterns.behavioral.strategy;

public class Application {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        //com cartao
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(150.0);

        //com PayPal
        cart.setPaymentStrategy(new PayPalPayment("cliente@email.com"));
        cart.checkout(200.0);

        //com Pix
        cart.setPaymentStrategy(new PixPayment("chave-pix-123"));
        cart.checkout(50.0);
    }
}
