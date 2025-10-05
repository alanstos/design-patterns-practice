package com.dev.alan.patterns.behavioral.observer;

import com.dev.alan.patterns.behavioral.observer.canalnotificacao.CanalNoticias;
import com.dev.alan.patterns.behavioral.observer.canalnotificacao.Observer;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ObserverCanalTest {

    @Test
    void testNotificacaoDeUsuarios() {
        Observer obs1 = Mockito.mock(Observer.class);
        Observer obs2 = Mockito.mock(Observer.class);

        CanalNoticias canal = new CanalNoticias();
        canal.addObserver(obs1);
        canal.addObserver(obs2);

        String noticia = "Breaking News!";
        canal.publicarNoticia(noticia);

        Mockito.verify(obs1).update(noticia);
        Mockito.verify(obs2).update(noticia);
    }
}
