package com.dev.alan.patterns.behavioral.chain;

public class Application {

    public static void main(String[] args) {
        // Monta a cadeia
        Handler level1 = new Level1Support();
        Handler level2 = new Level2Support();
        Handler specialist = new SpecialistSupport();

        level1.setNext(level2).setNext(specialist);

        // Testes
        level1.handle(new SupportRequest("BASICO"));
        level1.handle(new SupportRequest("INTERMEDIARIO"));
        level1.handle(new SupportRequest("CRITICO"));
        level1.handle(new SupportRequest("DESCONHECIDO"));
    }
}
