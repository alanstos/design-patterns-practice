package com.dev.alan.patterns.behavioral.chain;

// Concrete Handler 1


import static com.dev.alan.patterns.util.NivelEnum.BASICO;

public class Level1Support extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return BASICO.toString().equalsIgnoreCase(request.getType());
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Suporte Nivel 1 resolveu o problema: " + request.getType());
    }
}
