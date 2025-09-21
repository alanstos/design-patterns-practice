package com.dev.alan.patterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class FactoryTest {

    @Test
    void testSimples() {
        TransportFactory carFactory = new CarTransportFactory();
        Transport transport = carFactory.createTransport();

        transport.deliver();

        assertSame(transport.nome(), "carro", "sao iguais");

    }
}
