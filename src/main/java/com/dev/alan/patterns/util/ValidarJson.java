package com.dev.alan.patterns.util;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ValidarJson {

    public static boolean isValidJSON(String jsonString) {
        try {
            JsonParser.parseString(jsonString);
            return true;
        } catch (JsonSyntaxException e) {
            // Ocorreu um erro de sintaxe no JSON
            return false;
        }
    }
}
