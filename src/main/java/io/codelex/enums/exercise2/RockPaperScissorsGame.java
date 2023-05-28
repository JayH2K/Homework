package io.codelex.enums.exercise2;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Let us begin...");
        boolean ongoingGame = true;
        int gamesCount = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        while (ongoingGame) {
            RPS playerMove = null;
            RPS cpuMove = null;
            System.out.println("Input your choice (R for ROCK | P for PAPER | S for SCISSORS)");
            System.out.println("Or input X if you would like to exit.");
            String input = scan.nextLine();
            int cpuChoice = rn.nextInt(3) + 1;
            switch (input) {
                case "R": {
                    System.out.println("Rock-paper-scissors!");
                    playerMove = RPS.ROCK;
                    break;
                }
                case "P": {
                    System.out.println("Rock-paper-scissors!");
                    playerMove = RPS.PAPER;
                    break;
                }
                case "S": {
                    System.out.println("Rock-paper-scissors!");
                    playerMove = RPS.SCISSORS;
                    break;
                }
                case "X": {
                    if (gamesCount == 0) {
                        gamesCount++;
                    }
                    CalculateGame game = new CalculateGame(gamesCount, gamesWon, gamesLost);
                    System.out.println("You won " + gamesWon + " games (" + game.winPercent + "%) and lost " + gamesLost +
                            " games (" + game.lossPercent + "%) out of " + gamesCount + " total games!");
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                }
                default:
                    System.out.println("invalid input!");
                    continue;
            }
            switch (cpuChoice) {
                case 1: {
                    cpuMove = RPS.ROCK;
                    break;
                }
                case 2: {
                    cpuMove = RPS.PAPER;
                    break;
                }
                case 3: {
                    cpuMove = RPS.SCISSORS;
                    break;
                }
            }
            if (playerMove.beats.equals(cpuMove)) {
                System.out.println(playerMove.name + " beats " + cpuMove.name + ". You win!");
                gamesCount++;
                gamesWon++;
            } else if (cpuMove.beats.equals(playerMove)) {
                System.out.println(cpuMove.name + " beats " + playerMove.name + ". You lose...");
                gamesCount++;
                gamesLost++;
            } else {
                System.out.println("Both chose " + playerMove.name + ". It's a tie!");
                gamesCount++;
            }
        }
    }
}
