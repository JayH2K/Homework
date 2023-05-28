package io.codelex;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        long A = 1;

        if (N > 0) {

            for (int i = 1; i <= N; i++) {
                A = A * i;
            }
        } else {
            A = Long.parseLong("No negative integers");
        }

        System.out.println(A);
    }
}