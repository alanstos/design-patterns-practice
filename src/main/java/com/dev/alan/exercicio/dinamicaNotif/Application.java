package com.dev.alan.exercicio.dinamicaNotif;

import com.dev.alan.exercicio.dinamicaNotif.notification.EmailImpl;
import com.dev.alan.exercicio.dinamicaNotif.notification.SMSImpl;
import com.dev.alan.exercicio.dinamicaNotif.order.OnlineOrderProcessor;
import com.dev.alan.exercicio.dinamicaNotif.order.Order;
import com.dev.alan.exercicio.dinamicaNotif.order.OrderProcessor;
import com.dev.alan.exercicio.dinamicaNotif.payment.CardPaymentImpl;
import com.dev.alan.exercicio.dinamicaNotif.payment.PixImpl;

public class Application {

    public static void main(String[] args) {

        Order pedido = new Order(990, new PixImpl());

        pedido.addNotification(new EmailImpl());
        pedido.addNotification(new SMSImpl());

        OrderProcessor orderProcessor = new OnlineOrderProcessor();
        orderProcessor.processOrder(pedido);
    }
}
