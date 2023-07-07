package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.Scanner;


public class VideoStore {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Video> inventory = new ArrayList<>(0);


    public void addToInventory(Video vidName) {
        inventory.add(vidName);
    }

    public void rentVid(String vidName) {
        for (Video video : inventory) {
            if (video.title.equals(vidName)) {
                if (!video.rented) {
                    video.rented = true;
                } else {
                    System.out.println("Video either does not exist or has already been rented");
                }
            }
        }
    }

    public void returnVid(String vidName, Scanner scanner) {
        for (Video video : inventory) {
            if (video.title.equals(vidName)) {
                if (video.rented) {
                    System.out.println("Rented " + video.title);
                    video.rented = false;
                } else {
                    System.out.println("Video either does not exist or has not been rented");
                }
            }
        }
    }

    public void rate(String vidName, int rating) {
        for (Video video : inventory) {
            if (video.title.equals(vidName)) {
                video.rate(rating);
            }
        }
    }

    public void getInventory() {
        for (Video video : inventory) {
            System.out.print(" Video: " + video.getTitle() + " | Avg rating: " + video.calculateAverageRating() + " | ");

            if (video.rented) {
                System.out.println(" video is currently checked out\n");
            } else {
                System.out.println(" video is currently on the shelves\n");
            }
        }
    }
}
