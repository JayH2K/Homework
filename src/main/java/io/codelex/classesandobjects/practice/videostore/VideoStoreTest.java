package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    private static final VideoStore blockbuster = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a video (as user)");
            System.out.println("Choose 5 to see inventory");

            int n = keyboard.nextInt();
            keyboard.nextLine();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    Scanner scan = new Scanner(System.in);
                    System.out.println("What video would you like to rate?");
                    String vidName = scan.nextLine();
                    System.out.println("How would you rate the video from 1 to 10?");
                    int rating = scan.nextInt();
                    blockbuster.rate(vidName, rating);
                case 5:
                    blockbuster.getInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            scanner.nextLine();
            Video vid = new Video(movieName, rating);
            blockbuster.addToInventory(vid);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Please enter name of video to rent:");
        String vidName = scanner.nextLine();
        blockbuster.rentVid(vidName);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Please enter name of video to return:");
        String vidName = scanner.nextLine();
        blockbuster.returnVid(vidName, scanner);
    }
}
