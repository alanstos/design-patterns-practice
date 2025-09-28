package com.dev.alan.patterns.behavioral.state.atm;

public class NoCardState implements ATMState {

    private ATMContext atmContext;

    public NoCardState(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    @Override
    public void insertCard() {
        System.out.println("Cartao inserido. Digite seu PIN.");
        atmContext.setState(atmContext.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("Nenhum cartao para ejetar.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Insira o cartao primeiro.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Insira o cartao primeiro.");
    }
}
