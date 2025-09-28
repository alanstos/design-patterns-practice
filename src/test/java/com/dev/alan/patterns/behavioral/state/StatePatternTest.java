package com.dev.alan.patterns.behavioral.state;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatePatternTest {

    @Test
    void deveTransitarEntreEstadosCorretamente() {
        OrderContext order = new OrderContext();

        assertEquals("Novo", order.getStatus());

        order.next();
        assertEquals("Pago", order.getStatus());

        order.next();
        assertEquals("Enviado", order.getStatus());

        order.next();
        assertEquals("Entregue", order.getStatus());
    }

    @Test
    void deveVoltarAoEstadoAnterior() {
        OrderContext order = new OrderContext();

        order.next(); // Novo -> Pago
        assertEquals("Pago", order.getStatus());

        order.prev(); // Pago -> Novo
        assertEquals("Novo", order.getStatus());
    }

    @Test
    void naoPodeAvancarDepoisDeEntregue() {
        OrderContext order = new OrderContext();

        order.next(); // Pago
        order.next(); // Enviado
        order.next(); // Entregue

        assertEquals("Entregue", order.getStatus());

        // Tentando avançar além do último estado
        order.next();
        assertEquals("Entregue", order.getStatus());
    }
}
