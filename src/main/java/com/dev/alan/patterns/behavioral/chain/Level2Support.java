package com.dev.alan.patterns.behavioral.chain;

import static com.dev.alan.patterns.util.NivelEnum.INTERMEDIARIO;

// Concrete Handler 2
public class Level2Support extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return INTERMEDIARIO.toString().equalsIgnoreCase(request.getType());
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Suporte Nivel 2 resolveu o problema: " + request.getType());
    }
}
