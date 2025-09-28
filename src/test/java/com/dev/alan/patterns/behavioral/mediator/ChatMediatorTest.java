package com.dev.alan.patterns.behavioral.mediator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ChatMediatorTest {

    private ChatMediatorImpl mediator;

    @BeforeEach
    void setUp() {
        mediator = new ChatMediatorImpl();
    }

    @Test
    void testMessageIsDeliveredToOtherUsers() {
        User user1 = Mockito.spy(new UserImpl(mediator, "Alan"));
        User user2 = Mockito.spy(new UserImpl(mediator, "Maria"));

        mediator.addUser(user1);
        mediator.addUser(user2);

        user1.send("Olá!");

        // Verifica que user2 recebeu a mensagem
        Mockito.verify(user2).receive("Olá!");
        // Verifica que user1 NÃO recebeu (não se auto-notifica)
        Mockito.verify(user1, Mockito.never()).receive("Olá!");
    }
}
