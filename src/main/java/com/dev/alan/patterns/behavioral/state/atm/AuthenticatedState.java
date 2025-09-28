package com.dev.alan.patterns.behavioral.state.atm;

public class AuthenticatedState implements ATMState {

    private ATMContext atmContext;

    public AuthenticatedState(ATMContext atmContext) {
        this.atmContext = atmContext;
    }

    @Override
    public void insertCard() {
        System.out.println("Ja existe um cartao inserido.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cartao ejetado.");
        atmContext.setState(atmContext.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("PIN já foi autenticado.");
    }

    @Override
    public void withdrawCash(int amount) {
        if (atmContext.getCash() >= amount) {
            System.out.println("Retire seu dinheiro: R$" + amount);
            atmContext.setCash(atmContext.getCash() - amount);
            if (atmContext.getCash() <= 0) {
                atmContext.setState(atmContext.getOutOfMoneyState());
            }
        } else {
            System.out.println("Saldo insuficiente no ATM.");
            atmContext.setState(atmContext.getOutOfMoneyState());
        }
    }
}
