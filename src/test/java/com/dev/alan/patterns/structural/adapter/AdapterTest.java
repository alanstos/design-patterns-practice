package com.dev.alan.patterns.structural.adapter;

import com.dev.alan.patterns.util.ValidarJson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdapterTest {



    @Test
    void testApplicationUsaAdapter() {
        // Arrange
        XmlService xmlService = new XmlService();
        DataProcessor adapter = new XmlToJsonAdapter(xmlService);
        Application app = new Application(adapter);

        // Act
        String result = app.usar();

        // Assert
        assertTrue(ValidarJson.isValidJSON(result), "valor tipo JSON ok");
        assertTrue(result.contains("\"name\":\"Alan\""));
        assertTrue(result.contains("\"age\":99"));
    }

    @Test
    void testSimples() {
        XmlService xmlService = new XmlService();
        DataProcessor dataProcess = new XmlToJsonAdapter(xmlService);
        Application app = new Application(dataProcess);

        String retornoJson = app.usar();

        assertTrue(ValidarJson.isValidJSON(retornoJson), "valor tipo JSON ok");
    }
}
