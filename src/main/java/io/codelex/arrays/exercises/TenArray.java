package io.codelex.arrays.exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class TenArray {
    public static void main(String[] args) {
        double[] myArray1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        double[] myArray2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        NumberFormat formatter = new DecimalFormat("#0");

        for (int i = 0; i < myArray1.length; ++i) {
            if (i == 0) {
                System.out.print("Array 1:");
            }
            if (i != myArray1.length - 1) {
                myArray1[i] = Math.floor(Math.random() * 101);
                System.out.print(" " + formatter.format(myArray1[i]));
            } else {
                myArray1[i] = Math.floor(Math.random() * 101);
                System.out.println(" " + formatter.format(myArray1[i]));
            }
        }
        for (int i = 0; i < myArray2.length; i++) {
            if (i == 0) {
                System.out.print("Array 2:");
            }
            if (i != myArray2.length - 1) {
                myArray2[i] = myArray1[i];
                System.out.print(" " + formatter.format(myArray2[i]));
            } else {
                myArray2[i] = -7;
                System.out.println(" " + formatter.format(myArray2[i]));
            }
        }
    }
}
