package com.dev.alan.exercicio.pagamento;

public class PaymentOldService {

    final String CARTAO_CREDITO = "C";
    final String PIX = "P";
    final String BOLETO = "B";

    void pagar(String tipo, double valor){
        if (CARTAO_CREDITO.equals(tipo)){
            System.out.println("pagamento via cartao de credito..." + valor);
        }
        if (PIX.equals(tipo)){
            System.out.println("pagamento via pix.." + valor);
        }
        if (BOLETO.equals(tipo)){
            System.out.println("pagamento via boleto.." + valor);
        }
    }
}
