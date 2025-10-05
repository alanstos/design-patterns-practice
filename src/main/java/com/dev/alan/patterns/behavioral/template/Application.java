package com.dev.alan.patterns.behavioral.template;

public class Application {
    public static void main(String[] args) {
        PedidoProcessor cartao = new CartaoProcessor();
        PedidoProcessor boleto = new BoletoProcessor();
        PedidoProcessor pix = new PixProcessor();

        cartao.processarPedido("Alice", 250.0);
        boleto.processarPedido("Bob", 500.0);
        pix.processarPedido("Carol", 100.0);
    }
}
