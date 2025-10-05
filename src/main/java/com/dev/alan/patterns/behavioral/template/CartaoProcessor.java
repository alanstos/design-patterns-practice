package com.dev.alan.patterns.behavioral.template;

public class CartaoProcessor extends PedidoProcessor {
    @Override
    protected void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
}
