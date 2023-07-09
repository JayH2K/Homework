package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        System.out.println(scores);
        Map<String, ArrayList<String>> histogram = new LinkedHashMap<>();
        List<Integer> seperateScores = new ArrayList<>();
        for (String i : scores.split(" ")
        ) {
            seperateScores.add(Integer.parseInt(i));
        }
        Collections.sort(seperateScores);
        for (int i : seperateScores
        ) {
            if (i < 10) {
                if (histogram.containsKey("00-09")) {
                    histogram.get("00-09").add("*");
                } else {
                    histogram.put("00-09", new ArrayList<>());
                    histogram.get("00-09").add("*");
                }
            }
            if (i < 20 && i > 9) {
                if (histogram.containsKey("10-19")) {
                    histogram.get("10-19").add("*");
                } else {
                    histogram.put("10-19", new ArrayList<>());
                    histogram.get("10-19").add("*");
                }
            }
            if (i < 30 && i > 19) {
                if (histogram.containsKey("20-29")) {
                    histogram.get("20-29").add("*");
                } else {
                    histogram.put("20-29", new ArrayList<>());
                    histogram.get("20-29").add("*");
                }
            }
            if (i < 40 && i > 29) {
                if (histogram.containsKey("30-39")) {
                    histogram.get("30-39").add("*");
                } else {
                    histogram.put("30-39", new ArrayList<>());
                    histogram.get("30-39").add("*");
                }
            }
            if (i < 50 && i > 39) {
                if (histogram.containsKey("40-49")) {
                    histogram.get("40-49").add("*");
                } else {
                    histogram.put("40-49", new ArrayList<>());
                    histogram.get("40-49").add("*");
                }
            }
            if (i < 60 && i > 49) {
                if (histogram.containsKey("50-59")) {
                    histogram.get("50-59").add("*");
                } else {
                    histogram.put("50-59", new ArrayList<>());
                    histogram.get("50-59").add("*");
                }
            }
            if (i < 70 && i > 59) {
                if (histogram.containsKey("60-69")) {
                    histogram.get("60-69").add("*");
                } else {
                    histogram.put("60-69", new ArrayList<>());
                    histogram.get("60-69").add("*");
                }
            }
            if (i < 80 && i > 69) {
                if (histogram.containsKey("70-79")) {
                    histogram.get("70-79").add("*");
                } else {
                    histogram.put("70-79", new ArrayList<>());
                    histogram.get("70-79").add("*");
                }
            }
            if (i < 90 && i > 79) {
                if (histogram.containsKey("80-89")) {
                    histogram.get("80-89").add("*");
                } else {
                    histogram.put("80-89", new ArrayList<>());
                    histogram.get("80-89").add("*");
                }
            }
            if (i == 100) {
                if (histogram.containsKey("100")) {
                    histogram.get("100").add("*");
                } else {
                    histogram.put("100", new ArrayList<>());
                    histogram.get("100").add("*");
                }
            }
        }
        histogram.forEach((a, b) -> {
            System.out.print(a + ": ");
            for (String i : b
            ) {
                System.out.print(i);
            }
            System.out.println(" ");
        });

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
