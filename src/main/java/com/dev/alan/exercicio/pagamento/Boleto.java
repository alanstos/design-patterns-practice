package com.dev.alan.exercicio.pagamento;

public class Boleto implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("pagamento via boleto... " + amount);
    }
}
