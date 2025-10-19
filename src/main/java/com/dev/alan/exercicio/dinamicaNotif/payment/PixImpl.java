package com.dev.alan.exercicio.dinamicaNotif.payment;

public class PixImpl implements IPaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("[PAGAMENTO] pagamento via PIX OK $" + amount);
        return true;
    }
}
