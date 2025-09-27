package com.dev.alan.patterns.structural.facade;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacadeTest {

    @Test
    public void testPlaceOrderSuccess() {
        // Captura a saída do console
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("123-ABC", 250.00);

        String consoleOutput = output.toString();
        assertTrue(consoleOutput.contains("Verificando estoque para o produto: 123-ABC"));
        assertTrue(consoleOutput.contains("Processando pagamento no valor de: R$ 250.0"));
        assertTrue(consoleOutput.contains("Enviando produto: 123-ABC"));
        assertTrue(consoleOutput.contains("Pedido concluído com sucesso!"));
    }
}
