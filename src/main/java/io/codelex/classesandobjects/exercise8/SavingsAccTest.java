package io.codelex.classesandobjects.exercise8;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.text.DecimalFormat;

public class SavingsAccTest {
    public static void main(String[] args) {
        DecimalFormat decfor = new DecimalFormat("0,000.00");
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter starting balance:");
        double startBalance = scan.nextDouble();

        SavingsAccount acc = new SavingsAccount(startBalance);

        System.out.println("Please enter annual interest rate:");
        acc.setAnnualInterest(scan.nextDouble());

        System.out.println("How many months have passed since the account was established:");
        double months = scan.nextDouble();

        double totalDeposit = 0;
        double totalWithdrawn = 0;
        double interestEarned = 0;
        for (int i = 1; i <= months; i++) {
            System.out.println("Month " + i + ". Enter amount deposited:");
            double deposit = scan.nextDouble();
            totalDeposit += deposit;
            acc.deposit(deposit);
            System.out.println("Enter amount withdrawn:");
            double withdrawal = scan.nextDouble();
            totalWithdrawn += withdrawal;
            acc.withdraw(withdrawal);
            interestEarned += acc.calculateInterest();
            acc.addInterest();
        }

        System.out.println("Total deposited: $" + decfor.format(totalDeposit));
        System.out.println("Total withdrawn: $" + decfor.format(totalWithdrawn));
        System.out.println("Total interest earned: $" + decfor.format(interestEarned));
        System.out.println("Final balance: $" + decfor.format(acc.getBalance()));

    }
}
