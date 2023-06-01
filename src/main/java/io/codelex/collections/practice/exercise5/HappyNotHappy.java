package io.codelex.collections.practice.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HappyNotHappy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>(0);
        List<Integer> resultList = new ArrayList<>(0);
        int num = in.nextInt();
        boolean stop = false;
        boolean isHappy = false;
        boolean looping = false;
        int result = num;
        int iterations = 0;
        while (!stop) {
            numList.clear();
            for (String i : Integer.toString(result).split("")
            ) {
                numList.add(Integer.parseInt(i));
            }
            result = 0;
            for (int i : numList
            ) {
                result += Math.pow(i, 2);
            }
            if (iterations > 0 && result == num) {
                stop = true;
            }
            if (iterations > 0 && result == 1) {
                isHappy = true;
                stop = true;
            }
            System.out.println(result);
            if (resultList.contains(result)) {
                looping = true;
            } else {
                resultList.add(result);
            }
            if (looping) {
                System.out.println("That number creates a loop");
                System.exit(0);
            }
            iterations++;
        }
        if (isHappy) {
            System.out.println(num + " is happy!");
        } else {
            System.out.println(num + " is not happy...");
        }
    }
}
