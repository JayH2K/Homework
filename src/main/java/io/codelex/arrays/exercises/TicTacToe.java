package io.codelex.arrays.exercises;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] board = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        boolean xTurn = true;
        String winner = null;
        while (winner == null) {
            System.out.println("   1   2   3");
            System.out.println("1  " + board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("  -----------");
            System.out.println("2  " + board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("  -----------");
            System.out.println("3  " + board[6] + " | " + board[7] + " | " + board[8]);
            if (xTurn) {
                System.out.println("It is X's turn!");
            } else {
                System.out.println("It is O's turn!");
            }
            System.out.println("Please input row (from 1 to 3):");
            int input = scan.nextInt();
            System.out.println("Please input column (from 1 to 3):");
            int input2 = scan.nextInt();
            int position = ((input2 - 1) + ((input - 1) * 3));
            if (xTurn) {
                if (board[position].equals(" ")) {
                    board[position] = "X";
                    xTurn = false;
                } else {
                    System.out.println("That position is already taken!");
                }
            } else {
                if (board[position].equals(" ")) {
                    board[position] = "O";
                    xTurn = true;
                } else {
                    System.out.println("That position is already taken!");
                }
            }
            if (board[0].equals(board[1]) && board[1].equals(board[2])) {
                if (!board[0].equals(" ")) {
                    winner = board[0];
                }
            }
            if (board[3].equals(board[4]) && board[4].equals(board[5])) {
                if (!board[3].equals(" ")) {
                    winner = board[3];
                }
            }
            if (board[6].equals(board[7]) && board[7].equals(board[8])) {
                if (!board[6].equals(" ")) {
                    winner = board[6];
                }
            }
            if (board[0].equals(board[3]) && board[3].equals(board[6])) {
                if (!board[0].equals(" ")) {
                    winner = board[0];
                }
            }
            if (board[1].equals(board[4]) && board[4].equals(board[7])) {
                if (!board[1].equals(" ")) {
                    winner = board[1];
                }
            }
            if (board[2].equals(board[5]) && board[5].equals(board[8])) {
                if (!board[2].equals(" ")) {
                    winner = board[2];
                }
            }
            if (board[0].equals(board[4]) && board[4].equals(board[8])) {
                if (!board[0].equals(" ")) {
                    winner = board[0];
                }
            }
            if (board[2].equals(board[4]) && board[4].equals(board[6])) {
                if (!board[2].equals(" ")) {
                    winner = board[2];
                }
            }
            if (!Arrays.asList(board).contains(" ") && winner == null) {
                winner = "tie";
            }
            System.out.println("   1   2   3");
            System.out.println("1  " + board[0] + " | " + board[1] + " | " + board[2]);
            System.out.println("  -----------");
            System.out.println("2  " + board[3] + " | " + board[4] + " | " + board[5]);
            System.out.println("  -----------");
            System.out.println("3  " + board[6] + " | " + board[7] + " | " + board[8]);
            if (!Objects.equals(winner, "tie")) {
                System.out.println(winner + " wins!");
            } else {
                System.out.println("it's a tie!");
            }
        }
    }
}
