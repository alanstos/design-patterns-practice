package com.dev.alan.patterns.creational.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class FactoryMethodTest {

    @Test
    void testCarTransportFactory() {
        TransportFactory factory = new CarTransportFactory();
        Transport transport = factory.createTransport();
        assertEquals("entrega de carro", captureOutput(transport));
        assertEquals("carro", transport.nome());
    }

    @Test
    void testBikeTransportFactory() {
        TransportFactory factory = new BikeTransportFactory();
        Transport transport = factory.createTransport();
        assertEquals("entrega de bicicleta", captureOutput(transport));
        assertEquals("bike", transport.nome());
    }

    @Test
    void testMotorcycleTransportFactory() {
        TransportFactory factory = new MotorcycleTransportFactory();
        Transport transport = factory.createTransport();
        assertEquals("entrega de moto", captureOutput(transport));
        assertEquals("motorcycle", transport.nome());
    }

    private String captureOutput(Transport transport) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        transport.deliver();
        System.setOut(System.out);
        return outContent.toString().trim();
    }
}
