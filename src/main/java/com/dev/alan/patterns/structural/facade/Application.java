package com.dev.alan.patterns.structural.facade;

public class Application {

    OrderFacade orderFacade;

    public Application(OrderFacade orderFacade){
        this.orderFacade = orderFacade;
    }

    public static void main(String[] args) {
        Application app = new Application(new OrderFacade());
        app.orderFacade.placeOrder("123", 100);
    }
}
