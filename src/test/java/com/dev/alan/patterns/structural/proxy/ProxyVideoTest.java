package com.dev.alan.patterns.structural.proxy;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProxyVideoTest {

    @Test
    void deveCarregarVideoApenasNoPrimeiroPlay() {
        // cria mock do RealVideo (não executa o construtor real)
        RealVideo realVideoMock = Mockito.mock(RealVideo.class);

        // cria um ProxyVideo de teste que sobrescreve createRealVideo para retornar o mock
        ProxyVideo proxy = new ProxyVideo("filme_teste.mp4") {
            @Override
            protected RealVideo createRealVideo() {
                return realVideoMock;
            }
        };

        // Antes de play, realVideo interno ainda é null (verificamos por reflexão)
        assertNull(getRealVideo(proxy));

        // 1ª chamada -> deve chamar play() do realVideoMock uma vez
        proxy.play();
        verify(realVideoMock, times(1)).play();
        assertNotNull(getRealVideo(proxy));

        // 2ª chamada -> não recria, apenas reusa; play() chamado de novo
        proxy.play();
        verify(realVideoMock, times(2)).play();
    }

    @Test
    void deveCriarProxySemCarregarVideo() {
        ProxyVideo proxy = new ProxyVideo("filme_teste.mp4");
        assertNull(getRealVideo(proxy));
    }

    // método auxiliar para ler o campo privado realVideo via reflexão
    private RealVideo getRealVideo(ProxyVideo proxy) {
        try {
            var field = ProxyVideo.class.getDeclaredField("realVideo");
            field.setAccessible(true);
            return (RealVideo) field.get(proxy);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
