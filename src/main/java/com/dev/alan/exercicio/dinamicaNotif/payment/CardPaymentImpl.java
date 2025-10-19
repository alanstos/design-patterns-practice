package com.dev.alan.exercicio.dinamicaNotif.payment;

public class CardPaymentImpl implements IPaymentStrategy{
    @Override
    public boolean pay(double amount) {
        System.out.println("[PAGAMENTO] pagamento via CARTAO OK $" + amount);
        return true;
    }
}
