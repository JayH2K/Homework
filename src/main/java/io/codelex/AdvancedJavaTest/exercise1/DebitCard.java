package io.codelex.AdvancedJavaTest.exercise1;

import io.codelex.AdvancedJavaTest.NotEnoughFundsException;

public class DebitCard extends Card {


    double balance = 0;

    public DebitCard(long number, String CCV, String owner, double balance) {
        this.balance = balance;
    }

    @Override
    double getBalance() {
        return this.balance;
    }

    @Override
    void addMoney(double amount) {
        balance += amount;
        if (balance > 10000) {
            System.out.println("WARNING: Balance overload!");
        }
    }

    @Override
    void withdrawMoney(double amount) throws NotEnoughFundsException {
        if (balance - amount < 0) {
            throw new NotEnoughFundsException("Insufficient funds");
        }
        balance -= amount;
    }
}
