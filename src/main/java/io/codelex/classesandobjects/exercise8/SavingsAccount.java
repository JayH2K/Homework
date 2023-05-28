package io.codelex.classesandobjects.exercise8;

public class SavingsAccount {

    double balance;

    double annualInterest;

    public SavingsAccount(double startBalance) {
        this.balance = startBalance;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double ammount) {
        this.balance -= ammount;
    }

    public void deposit(double ammount) {
        this.balance += ammount;
    }

    public double calculateInterest() {
        return this.balance * (this.annualInterest / 12);
    }

    public void addInterest() {
        this.balance += calculateInterest();
    }
}
