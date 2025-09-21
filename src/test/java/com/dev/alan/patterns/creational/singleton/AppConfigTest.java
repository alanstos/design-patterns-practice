package com.dev.alan.patterns.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppConfigTest {

    @Test
    void testSingletonInstance() {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        assertNotNull(config1, "A instância não deve ser nula");
        assertSame(config1, config2, "As instâncias devem ser a mesma (singleton)");
    }

    @Test
    void testDefaultValues() {
        AppConfig config = AppConfig.getInstance();

        assertEquals("pt-br", config.getLanguage(), "Idioma padrão deve ser pt-br");
        assertEquals("light", config.getTheme(), "Tema padrão deve ser light");
    }

    @Test
    void testSettersAndGetters() {
        AppConfig config = AppConfig.getInstance();

        config.setLanguage("en-us");
        config.setTheme("dark");

        assertEquals("en-us", config.getLanguage(), "Idioma deve ser atualizado para en-us");
        assertEquals("dark", config.getTheme(), "Tema deve ser atualizado para dark");
    }

    @Test
    void testSingletonAffectsAllReferences() {
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        config1.setLanguage("es");
        config1.setTheme("blue");

        assertEquals("es", config2.getLanguage(), "Ambas referências devem compartilhar o mesmo idioma");
        assertEquals("blue", config2.getTheme(), "Ambas referências devem compartilhar o mesmo thema");
    }

    @Test
    void testSharedState() {
        AppConfig config1 = AppConfig.getInstance();
        config1.setTheme("dark");

        AppConfig config2 = AppConfig.getInstance();
        assertEquals("dark", config2.getTheme(), "O estado deve ser compartilhado entre instâncias.");
    }
}