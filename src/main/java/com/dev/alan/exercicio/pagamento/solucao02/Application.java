package com.dev.alan.exercicio.pagamento.solucao02;

import com.dev.alan.exercicio.pagamento.PagamentosEnum;
import com.dev.alan.exercicio.pagamento.PaymentMethod;
import com.dev.alan.exercicio.pagamento.PaymentProcessor;

public class Application {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        //cartao
        PaymentMethod paymentMethod1 = PaymentFactory.create(PagamentosEnum.CARTAO_CREDITO);

        paymentProcessor.setMethod(paymentMethod1);
        paymentProcessor.process(400);

        //boleto
        PaymentMethod paymentMethod2 = PaymentFactory.create(PagamentosEnum.BOLETO);

        paymentProcessor.setMethod(paymentMethod2);
        paymentProcessor.process(500);
    }
}
