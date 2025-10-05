package com.dev.alan.patterns.behavioral.template;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PedidoProcessorTest {

    @Test
    void testProcessarPedidoChamaEfetuarPagamento() {
        PedidoProcessor processor = Mockito.spy(new CartaoProcessor());

        processor.processarPedido("ClienteTeste", 100.0);

        Mockito.verify(processor).efetuarPagamento(100.0);
    }
}
