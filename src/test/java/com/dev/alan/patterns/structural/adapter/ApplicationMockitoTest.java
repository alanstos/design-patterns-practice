package com.dev.alan.patterns.structural.adapter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApplicationMockitoTest {

    @Test
    void testApplicationComMock() {
        // Arrange
        DataProcessor mockProcessor = Mockito.mock(DataProcessor.class);

        // configuramos o comportamento esperado do mock
        when(mockProcessor.process()).thenReturn("{\"name\":\"MockUser\",\"age\":999}");

        Application app = new Application(mockProcessor);

        // Act
        String result = app.usar();

        // Assert
        assertEquals("{\"name\":\"MockUser\",\"age\":999}", result);

        // Verifica se o método process() foi realmente chamado
        verify(mockProcessor, times(1)).process();
    }
}
