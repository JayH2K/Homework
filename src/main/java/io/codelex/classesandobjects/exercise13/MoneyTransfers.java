package io.codelex.classesandobjects.exercise13;

import io.codelex.classesandobjects.practice.Account;

public class MoneyTransfers {

    public static void transfer(Account from, Account to, double howMuch) {

        from.withdrawal(howMuch);
        to.deposit(howMuch);

    }

    public static void main(String[] args) {
        Account mattAccount = new Account("Matt Murdock", 1000);
        Account gregAccount = new Account("Greggory House", 300);
        Account myAccount = new Account("Jay Hirsch", 0);

        System.out.println(mattAccount.balance());
        System.out.println(gregAccount.balance());
        System.out.println(myAccount.balance());

        System.out.println("*trensfers happen*");

        transfer(mattAccount, gregAccount, 50);
        transfer(gregAccount, myAccount, 25);

        System.out.println(mattAccount.balance());
        System.out.println(gregAccount.balance());
        System.out.println(myAccount.balance());

    }

}
