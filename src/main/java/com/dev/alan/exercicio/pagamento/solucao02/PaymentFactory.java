package com.dev.alan.exercicio.pagamento.solucao02;

import com.dev.alan.exercicio.pagamento.CartaoCredito;
import com.dev.alan.exercicio.pagamento.PIX;
import com.dev.alan.exercicio.pagamento.Boleto;
import com.dev.alan.exercicio.pagamento.PagamentosEnum;
import com.dev.alan.exercicio.pagamento.PaymentMethod;


import static com.dev.alan.exercicio.pagamento.PagamentosEnum.*;

public class PaymentFactory {

    static PaymentMethod create(PagamentosEnum pagamentosEnum){
        if (CARTAO_CREDITO.equals(pagamentosEnum)){
            return new CartaoCredito();
        }
        if (PIX.equals(pagamentosEnum)){
            return new PIX();
        }
        if (BOLETO.equals(pagamentosEnum)){
            return new Boleto();
        }
        throw new IllegalArgumentException("Tipo pagamento invalido");
    }
}
