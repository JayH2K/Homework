package io.codelex.classesandobjects.exercise13;

import io.codelex.classesandobjects.practice.Account;

public class YourFirstMoneyTransfer {
    public static void main(String[] args) {
        Account mattAccount = new Account("Matt Murdock", 1000);
        Account myAccount = new Account("Jay Hirsch", 0);

        mattAccount.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(mattAccount.balance());
        System.out.println(myAccount.balance());
    }

}
