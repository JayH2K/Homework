package io.codelex.exceptions.practice;

public class Exercise2 {
    public void methodA(int a) throws ArithmeticException {
        methodB(a);
    }

    public void methodB(int a) throws ArithmeticException {
        methodC(a);
    }

    public void methodC(int a) throws ArithmeticException {
        System.out.println(a / 0);
    }

    public static void main(String[] args) {
        Exercise2 ex2 = new Exercise2();

        ex2.methodA(8);
    }
}
