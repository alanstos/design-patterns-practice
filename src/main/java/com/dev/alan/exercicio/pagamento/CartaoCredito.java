package com.dev.alan.exercicio.pagamento;

public class CartaoCredito implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("pagamento via cartao credito... " + amount);
    }
}
