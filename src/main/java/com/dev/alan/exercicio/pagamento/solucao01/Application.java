package com.dev.alan.exercicio.pagamento.solucao01;

import com.dev.alan.exercicio.pagamento.Boleto;
import com.dev.alan.exercicio.pagamento.PIX;
import com.dev.alan.exercicio.pagamento.PaymentProcessor;

public class Application {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        //pix
        paymentProcessor.setMethod(new PIX());
        paymentProcessor.process(100);

        //boleto
        paymentProcessor.setMethod(new Boleto());
        paymentProcessor.process(99);
    }
}
