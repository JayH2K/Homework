package io.codelex.trivia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.*;

public class Trivia {
    private static String getQuestion() {
        try {
            URL url = new URL("http://numbersapi.com/random?min=1&max=100");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.readLine();
            reader.close();
            connection.disconnect();
            return response;
        } catch (MalformedURLException | ProtocolException e) {
            throw new RuntimeException("Protocol error! Either malformed URL or error in underlying protocol, such as TCP error!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();

        int counter = 0;
        List<String> numbers = new ArrayList<>();

        while (counter < 20) {
            String q = getQuestion();
            List<String> answer = new ArrayList<>(List.of(q.split(" ")));
            String number = answer.get(0);

            if (numbers.contains(number)) {
                continue;
            }

            numbers.add(number);
            answer.remove(0);
            String question = "What " + String.join(" ", answer).replace(".", "?");

            System.out.println(question);

            int correct = rn.nextInt(3) + 1;
            for (int i = 1; i <= 3; i++) {

                switch (i) {
                    case 1 -> System.out.print("A: ");
                    case 2 -> System.out.print("B: ");
                    case 3 -> System.out.print("C: ");
                }

                if (i == correct) {
                    System.out.println(number);
                } else {
                    System.out.println(rn.nextInt(100) + 1);
                }
            }

            System.out.println("Input your number!");
            String input = in.nextLine();

            if (input.equals(number)) {
                System.out.println("Correct! Let's continue!");
                counter++;
            } else {
                System.out.println("Wrong... you answered correctly " + counter + " times! The question you last answered was:");
                System.out.println(question);
                System.out.println("Thanks for playing!");
                System.exit(0);
            }
        }
        System.out.println("Congratulations! You answered all 20 questions!");
    }
}
