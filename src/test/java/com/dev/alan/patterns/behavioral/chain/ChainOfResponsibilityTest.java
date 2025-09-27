package com.dev.alan.patterns.behavioral.chain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static com.dev.alan.patterns.util.NivelEnum.*;

class ChainOfResponsibilityTest {

    private Level1Support level1;
    private Level2Support level2;
    private SpecialistSupport specialist;

    @BeforeEach
    void setup() {
        level1 = Mockito.spy(new Level1Support());
        level2 = Mockito.spy(new Level2Support());
        specialist = Mockito.spy(new SpecialistSupport());

        level1.setNext(level2).setNext(specialist);
    }

    @Test
    void deveSerResolvidoPorNivel1() {
        SupportRequest request = new SupportRequest(BASICO.toString());
        level1.handle(request);

        verify(level1, times(1)).process(request);
        verify(level2, never()).process(request);
        verify(specialist, never()).process(request);
    }

    @Test
    void deveSerResolvidoPorNivel2() {
        SupportRequest request = new SupportRequest(INTERMEDIARIO.toString());
        level1.handle(request);

        verify(level1, never()).process(request);
        verify(level2, times(1)).process(request);
        verify(specialist, never()).process(request);
    }

    @Test
    void deveSerResolvidoPorEspecialista() {
        SupportRequest request = new SupportRequest(CRITICO.toString());
        level1.handle(request);

        verify(level1, never()).process(request);
        verify(level2, never()).process(request);
        verify(specialist, times(1)).process(request);
    }

    @Test
    void devePercorrerTodaCadeiaSemResolver() {
        SupportRequest request = new SupportRequest("DESCONHECIDO");
        level1.handle(request);

        // Nenhum handler deve processar
        verify(level1, never()).process(request);
        verify(level2, never()).process(request);
        verify(specialist, never()).process(request);
    }
}

