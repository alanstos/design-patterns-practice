package com.dev.alan.patterns.behavioral.state;

public class Application {

    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        System.out.println(order.getStatus());

        order.next();
        System.out.println(order.getStatus());

        order.next();
        System.out.println(order.getStatus());

        order.next();
        System.out.println(order.getStatus());

        order.next();
        System.out.println(order.getStatus());
    }
}
