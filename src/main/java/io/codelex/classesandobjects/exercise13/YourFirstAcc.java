package io.codelex.classesandobjects.exercise13;

import io.codelex.classesandobjects.practice.Account;

public class YourFirstAcc {
    public static void main(String[] args) {
        Account myAccount = new Account("Jay Hirsch", 100);

        myAccount.deposit(20);

        System.out.println(myAccount.balance());
    }

}
