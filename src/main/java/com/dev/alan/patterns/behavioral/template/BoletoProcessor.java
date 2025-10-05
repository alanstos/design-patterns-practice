package com.dev.alan.patterns.behavioral.template;

public class BoletoProcessor extends PedidoProcessor {
    @Override
    protected void efetuarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + valor + ".");
    }
}
