package com.dev.alan.exercicio.pagamento;

public class PIX implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("pagamento via pix... " + amount);
    }
}
