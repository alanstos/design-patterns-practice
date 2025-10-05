package com.dev.alan.patterns.behavioral.template;

public abstract class PedidoProcessor {

    // Template Method
    public final void processarPedido(String cliente, double valor) {
        validarPedido(cliente, valor);
        efetuarPagamento(valor);
        emitirNotaFiscal();
        enviarConfirmacao(cliente);
    }

    protected void validarPedido(String cliente, double valor) {
        System.out.println("Validando pedido para " + cliente + " no valor de R$ " + valor);
    }

    protected abstract void efetuarPagamento(double valor);

    protected void emitirNotaFiscal() {
        System.out.println("Nota fiscal emitida.");
    }

    protected void enviarConfirmacao(String cliente) {
        System.out.println("Confirmação enviada para " + cliente);
    }
}
