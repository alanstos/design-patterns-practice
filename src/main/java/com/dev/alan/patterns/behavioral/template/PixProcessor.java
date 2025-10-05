package com.dev.alan.patterns.behavioral.template;

public class PixProcessor extends PedidoProcessor {
    @Override
    protected void efetuarPagamento(double valor) {
        System.out.println("Pagamento via PIX no valor de R$ " + valor + ".");
    }
}
