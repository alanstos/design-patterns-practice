package com.dev.alan.patterns.structural.decorator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class DecoratorTest {

    @Test
    public void testSimples(){
        Notifier base = new EmailNotifier();
        base = new SMSNotifier(base);

        Application app = new Application();
        app.setNotifier(base);
        app.executar("Ola, voce tem uma nova mensagem!");
    }


    @Test
    public void testSlackNotifierDelegatesToWrappee() {
        // Mock do Notifier base
        Notifier baseNotifierMock = Mockito.mock(Notifier.class);

        // Decora com SlackNotifier
        Notifier slackNotifier = new SlackNotifier(baseNotifierMock);

        // Executa
        slackNotifier.send("Mensagem Slack");

        // Verifica se o notifier interno foi chamado
        verify(baseNotifierMock, times(1)).send("Mensagem Slack");
    }

    @Test
    public void testExecutarComMensagemPadrao() {
        // Arrange
        Notifier notifierMock = Mockito.mock(Notifier.class);
        Application app = new Application();
        app.setNotifier(notifierMock);

        // Act
        app.executar();

        // Assert
        verify(notifierMock, times(1)).send("SOCORRO! SISTEMA FORA");
    }
}
