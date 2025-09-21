package com.dev.alan.patterns.structural.facade;

public class InventoryService {

    public boolean isAvailable(String productId) {
        System.out.println("Verificando estoque para o produto: " + productId);
        return true; // para simplificar, sempre disponível
    }
}
