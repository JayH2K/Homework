package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class Video {

    String title;
    boolean rented = false;

    ArrayList<Integer> ratings = new ArrayList<>(0);

    public Video(String title, int rating) {
        this.title = title;
        this.ratings.add(rating);
    }

    public void rate(int rating) {
        this.ratings.add(rating);
    }

    public int calculateAverageRating() {
        int avgRating = 0;
        for (int i = 0; i < this.ratings.size(); i++) {
            avgRating += this.ratings.get(i);
        }
        if (this.ratings.size() > 0) {
            avgRating = avgRating / (this.ratings.size());
        }
        return avgRating;
    }

    public String getTitle() {
        return this.title;
    }

}
