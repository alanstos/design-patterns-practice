package com.dev.alan.patterns.behavioral.chain;

import static com.dev.alan.patterns.util.NivelEnum.CRITICO;

// Concrete Handler 3
public class SpecialistSupport extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return CRITICO.toString().equalsIgnoreCase(request.getType());
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Suporte Especializado resolveu o problema: " + request.getType());
    }
}
