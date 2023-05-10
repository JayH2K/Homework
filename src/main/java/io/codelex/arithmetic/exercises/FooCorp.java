package io.codelex.arithmetic.exercises;

public class FooCorp {
    public static double sortData(String employeeName, double basePay, int hoursWorked) {
        int overtimeHours = 0;
        boolean legalHours = false;
        boolean legalPay = false;
        if (hoursWorked > 40) overtimeHours = hoursWorked - 40;
        double totalPay = basePay * (hoursWorked - overtimeHours) + ((basePay * 1.5) * overtimeHours);
        if (basePay < 8) legalPay = true;
        if (hoursWorked < 60) legalHours = true;

        if (legalHours && legalPay) {
            return totalPay;
        } else {
            return 0;
        }
    }
    public static void main(String[] args){
        double employee1pay = sortData("employee 1", 7.50, 35);
        double employee2pay = sortData("employee 2", 8.20, 47);
        double employee3pay = sortData("employee 3", 10.200, 73);

        if (employee1pay>0) {
            System.out.println("Employee 1 totally pay: " + employee1pay);
        } else {
            System.out.println("Employee 1 totally pay: ERROR");
        }

        if (employee2pay>0) {
            System.out.println("Employee 2 totally pay: " + employee2pay);
        } else {
            System.out.println("Employee 2 totally pay: ERROR");
        }

        if (employee3pay>0) {
            System.out.println("Employee 3 totally pay: " + employee3pay);
        } else {
            System.out.println("Employee 3 totally pay: ERROR");
        }
    }
}
