package com.dev.alan.exercicio.pagamento;

public class PaymentProcessor {

    private PaymentMethod method;
    public PaymentProcessor(){

    }
    public PaymentProcessor(PaymentMethod method){
        this.method = method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
    }

    public void process(double amount){
        if (this.method == null){
            throw new RuntimeException("nenhum metodo configurado");
        }
        this.method.pay(amount);
    }
}
