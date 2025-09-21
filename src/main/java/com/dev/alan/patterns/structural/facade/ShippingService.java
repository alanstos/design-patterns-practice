package com.dev.alan.patterns.structural.facade;

public class ShippingService {

    public void shipProduct(String productId) {
        System.out.println("Enviando produto: " + productId);
    }
}
