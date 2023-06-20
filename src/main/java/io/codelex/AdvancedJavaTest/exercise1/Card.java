package io.codelex.AdvancedJavaTest.exercise1;

import io.codelex.AdvancedJavaTest.NotEnoughFundsException;

public abstract class Card {

    abstract double getBalance();

    abstract void addMoney(double amount);

    abstract void withdrawMoney(double amount) throws NotEnoughFundsException;

}
