package com.dev.alan.patterns.behavioral.state.atm;

public class ATMContext {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState authenticatedState;
    private ATMState outOfMoneyState;

    private ATMState currentState;
    private int cash;

    public ATMContext(int initialCash) {
        this.noCardState = new NoCardState(this);
        this.hasCardState = new HasCardState(this);
        this.authenticatedState = new AuthenticatedState(this);
        this.outOfMoneyState = new OutOfMoneyState(this);

        this.cash = initialCash;

        this.currentState = (initialCash > 0) ? noCardState : outOfMoneyState;
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getAuthenticatedState() {
        return authenticatedState;
    }

    public ATMState getOutOfMoneyState() {
        return outOfMoneyState;
    }
}
