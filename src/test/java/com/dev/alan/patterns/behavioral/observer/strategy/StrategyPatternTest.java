package com.dev.alan.patterns.behavioral.observer.strategy;

import com.dev.alan.patterns.behavioral.strategy.PaymentStrategy;
import com.dev.alan.patterns.behavioral.strategy.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class StrategyPatternTest {

    @Test
    void deveExecutarPagamentoComEstrategiaDefinida() {
        PaymentStrategy strategy = Mockito.mock(PaymentStrategy.class);
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(strategy);
        cart.checkout(100.0);

        verify(strategy, times(1)).pay(100.0);
    }

    @Test
    void deveLancarExcecaoSeNaoDefinirEstrategia() {
        ShoppingCart cart = new ShoppingCart();

        org.junit.jupiter.api.Assertions.assertThrows(
                IllegalStateException.class,
                () -> cart.checkout(100.0)
        );
    }
}
