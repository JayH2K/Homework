package io.codelex.typesandvariables.practice;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        int a = 1; //Should have used int instead of String.
        int b = 2; //Cannot use full word 'Integer'. Use int.
        int c = 3;
        int d = 4; //No need for double. int will suffice.
        int e = 5; //No need for float. int will suffice.

        System.out.println(a + b + c + d + e); //Simplified. Removed need for variable sum.
    }

    private static void second() {
        int a = 1; //Should have used Int instead of String
        int b = 2; //Cannot use full word 'Integer'. Use Int.
        int c = 3;
        double d = 4.2; //No need for double. int will suffice.
        double e = 5.3; //Should have used double instead of float.

        System.out.println(a + b + c + d + e); //Simplified. Removed need for variable sum.
    }
}/*Nezinu, vai no tā ir jēga, bet ņemot vērā, ka uzdevums strukturēts, itkā pretī ir 'fake kolēģis', pievienoju piebildes,
kas cik saprotu šādā gadijumā būtu piemēroti.*/

