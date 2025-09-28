package com.dev.alan.patterns.behavioral.state.atm;

public class OutOfMoneyState implements ATMState {

    private ATMContext atmContext;

    public OutOfMoneyState(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM sem dinheiro. Operação cancelada.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Nenhum cartão para ejetar.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("ATM sem dinheiro.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("ATM sem dinheiro.");
    }
}
