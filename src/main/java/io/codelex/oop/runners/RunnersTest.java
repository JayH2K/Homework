package io.codelex.oop.runners;

public class RunnersTest {
    public static void main(String[] args) {
        Runner nr4785 = Runner.getFitnesLevel(48);
        Runner nr1023 = Runner.getFitnesLevel(101);
        Runner nr2982 = Runner.getFitnesLevel(36);
        System.out.println("Runner nr2982 is an " + nr2982 + " runner, and nr4785 is an " + nr4785 + " runner, while nr 1023 is just a " + nr1023);
    }
}
