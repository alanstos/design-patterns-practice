package com.dev.alan.exercicio.dinamicaNotif.order;

import com.dev.alan.exercicio.dinamicaNotif.notification.INotificationObserver;
import com.dev.alan.exercicio.dinamicaNotif.payment.IPaymentStrategy;

import java.util.HashSet;
import java.util.Set;

public class Order {

    private final double amount;
    Set<INotificationObserver> observers = new HashSet<>();
    IPaymentStrategy paymentStrategy;
    
    public Order(double amount, IPaymentStrategy paymentStrategy){
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void addNotification(INotificationObserver notification) {
        this.observers.add(notification);
    }

    void notifyObservers(String message){
        for (INotificationObserver o : observers) {
            o.update(message);
        }
    }

    public IPaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public double getAmount() {
        return amount;
    }

    //    public void processarPedido(double amount) {
//        validar(amount);
//        efetuarPagamento(amount);
//        notificacao();
//    }

    void validar(double amount){
        System.out.println("[VALIDACAO] validacao/pedido $" + amount);
    }

    void efetuarPagamento(double amount){
        this.paymentStrategy.pay(amount);
    }

    void notificacao(){
        notifyObservers("PEDIDO CONFIRMADO!");
    }
}
