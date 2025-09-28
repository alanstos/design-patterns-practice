package com.dev.alan.patterns.behavioral.state.atm;

public class HasCardState implements ATMState {

    private ATMContext atmContext;

    public HasCardState(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    @Override
    public void insertCard() {
        System.out.println("Cartao ja inserido.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cartao ejetado.");
        atmContext.setState(atmContext.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN correto. Voce pode sacar dinheiro.");
            atmContext.setState(atmContext.getAuthenticatedState());
        } else {
            System.out.println("PIN incorreto. Cartao ejetado.");
            atmContext.setState(atmContext.getNoCardState());
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Digite o PIN primeiro.");
    }
}
