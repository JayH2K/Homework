package io.codelex.AdvancedJavaTest.exercise1;

import io.codelex.AdvancedJavaTest.NotEnoughFundsException;

public class CreditCard extends Card {


    double balance = 0;

    public CreditCard(long number, String CCV, String owner, double balance) {
        this.balance = balance;
    }

    @Override
    double getBalance() {
        return this.balance;
    }

    @Override
    void addMoney(double amount) {
        balance += amount;
    }

    @Override
    void withdrawMoney(double amount) throws NotEnoughFundsException {
        if (balance - amount < 0) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance -= amount;
        if (balance < 100) {
            System.out.println("WARNING: Low funds!");
        }
    }
}
