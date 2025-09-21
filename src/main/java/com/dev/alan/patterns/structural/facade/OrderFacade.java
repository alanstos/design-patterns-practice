package com.dev.alan.patterns.structural.facade;

public class OrderFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        this.inventoryService = new InventoryService();
        this.paymentService = new PaymentService();
        this.shippingService = new ShippingService();
    }

    public void placeOrder(String productId, double amount){
        if (!inventoryService.isAvailable(productId)){
            System.out.println("Produto indisponível no estoque!");
            return;
        }

        if (paymentService.processPayment(amount)) {
            shippingService.shipProduct(productId);
            System.out.println("Pedido concluído com sucesso!");
            return;
        }

        System.out.println("Falha no pagamento!");
    }

}
