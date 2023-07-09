package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flightPlan = Files.readAllLines(path, charset);
        Map<String, ArrayList<String>> flights = new HashMap<>();
        Collections.sort(flightPlan);
        System.out.println(flightPlan);
        for (String i : flightPlan) {
            flights.put(i.split(" -> ")[0], new ArrayList<>());
        }
        for (String i : flightPlan) {
            flights.get(i.split(" -> ")[0]).add(i.split(" -> ")[1]);
        }
        System.out.println("Here is a list of cities:");
        System.out.println("San Francisco\nNew York\nHonolulu\nAnchorage\nDenver\nSan Jose");
        System.out.println("Enter name of starting city:");
        boolean end = false;
        String start = "";
        String plan = "";
        try {
            String input = in.nextLine();
            plan = plan.concat(input);
            start = input;
            System.out.println("Available destinations from " + input);
            for (int i = 0; i < flights.get(input).size(); i++) {
                System.out.println(flights.get(input).get(i));
            }
            while (!end) {

                input = in.nextLine();
                plan = plan.concat(" -> " + input);
                if (input.equals(start)) {
                    end = true;
                }
                System.out.println("Available destinations from " + input);
                for (int i = 0; i < flights.get(input).size(); i++) {
                    System.out.println(flights.get(input).get(i));
                }

            }
        } catch (NullPointerException e) {
            System.out.println("Not an available destination. Check case/spelling and start over.");
            System.exit(0);
        }
        System.out.println("Your flight plan: " + plan);
    }
}
