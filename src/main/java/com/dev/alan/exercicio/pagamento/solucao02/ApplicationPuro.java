package com.dev.alan.exercicio.pagamento.solucao02;

import com.dev.alan.exercicio.pagamento.PagamentosEnum;
import com.dev.alan.exercicio.pagamento.PaymentMethod;
import com.dev.alan.exercicio.pagamento.PaymentProcessor;

public class ApplicationPuro {

    public static void main(String[] args) {
        //cartao
        PaymentMethod paymentMethod1 = PaymentFactory.create(PagamentosEnum.CARTAO_CREDITO);
        paymentMethod1.pay(700);

        //boleto
        PaymentMethod paymentMethod2 = PaymentFactory.create(PagamentosEnum.BOLETO);
        paymentMethod2.pay(900);
    }
}
