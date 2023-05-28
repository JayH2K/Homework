package io.codelex.classesandobjects.exercise4;

import java.util.ArrayList;

public class Movie {

    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }

    public static Object[] getPG(Movie[] movieArray) {

        ArrayList<Movie> pgArray = new ArrayList<>();
        for (Movie movie : movieArray) {
            if (movie.rating.equals("PG")) {
                pgArray.add(movie);
            }
        }
        return pgArray.toArray();

    }

    public String toString() {
        return this.title;
    }
}
