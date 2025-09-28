package com.dev.alan.patterns.behavioral.state.atm;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}
