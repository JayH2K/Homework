package io.codelex.loops.exercises;

public class AsciiFigure {

    public static final int levels = 3;

    public static void main(String[] args) {
        for (int i = 0; i < levels; ++i) {
            int lvlSize = 4 * levels;

            System.out.print("/".repeat((-4 * i) + lvlSize - 4));
            System.out.print("*".repeat(4 * (i * 2)));
            System.out.println("\\".repeat((-4 * i) + lvlSize - 4));

        }
    }
}
