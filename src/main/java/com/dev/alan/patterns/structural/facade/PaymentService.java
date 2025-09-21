package com.dev.alan.patterns.structural.facade;

public class PaymentService {

    public boolean processPayment(double amount) {
        System.out.println("Processando pagamento no valor de: R$ " + amount);
        return true; // simula pagamento aprovado
    }
}
