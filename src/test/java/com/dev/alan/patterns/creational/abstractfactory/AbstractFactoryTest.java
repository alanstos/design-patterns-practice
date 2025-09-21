package com.dev.alan.patterns.creational.abstractfactory;

import com.dev.alan.patterns.creational.abstractfatory.Application;
import com.dev.alan.patterns.creational.abstractfatory.UIFactory;
import com.dev.alan.patterns.creational.abstractfatory.concrete.MacFactory;
import com.dev.alan.patterns.creational.abstractfatory.concrete.WindowsFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFactoryTest {

    @Test
    void testWindowsUI() {
        UIFactory factory = new WindowsFactory();
        Application app = new Application(factory);

        String ui = app.renderUI();
        assertTrue(ui.contains("win|win"), "UI deve ser renderizada no estilo Windows");
    }

    @Test
    void testMacUI() {
        UIFactory factory = new MacFactory();
        Application app = new Application(factory);

        String ui = app.renderUI();
        assertTrue(ui.contains("mac"), "UI deve ser renderizada no estilo Mac");
    }

    @Test
    void TestSimplesMac(){
        UIFactory factoryUiMac = new MacFactory();
        UIFactory factoryUiWin = new WindowsFactory();

        Application app = new Application();
        String so = app.usandoFactory(factoryUiMac);

        assertEquals("macmac", so);

        so = app.usandoFactory(factoryUiWin);
        assertEquals("winwin", so);
    }


}
