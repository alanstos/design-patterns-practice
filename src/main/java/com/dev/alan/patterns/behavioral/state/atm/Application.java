package com.dev.alan.patterns.behavioral.state.atm;

public class Application {
    public static void main(String[] args) {
        ATMContext atm = new ATMContext(1000);

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);

        System.out.println("Saldo : R$ " + atm.getCash());

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(600); // Vai cair para OutOfMoneyState
    }
}
