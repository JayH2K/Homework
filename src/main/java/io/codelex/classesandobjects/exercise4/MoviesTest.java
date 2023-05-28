package io.codelex.classesandobjects.exercise4;


import java.util.Arrays;

public class MoviesTest {

    public static final Movie film1 = new Movie("Casino Royale", "Eon Productions", "PG13");
    public static final Movie film2 = new Movie("Glass", "Buena Vista International", "PG13");
    public static final Movie film3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures");

    public static void main(String[] args) {

        Movie[] filmArray = {film1, film2, film3};
        System.out.println(Arrays.toString(Movie.getPG(filmArray)));
    }
}
