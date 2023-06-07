package io.codelex.classesandobjects.practice;

import java.text.DecimalFormat;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    DecimalFormat decfor = new DecimalFormat("0.00");

    public String name;
    public double balance;

    public final void deposit(double amount) {
        this.balance += amount;
    }

    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        if (balance > 0) {
            return name + ", $" + decfor.format(balance);
        } else {
            return name + ", -$" + decfor.format(balance);
        }
    }

}
