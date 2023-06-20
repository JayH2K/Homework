package io.codelex.AdvancedJavaTest.exercise4;

import java.io.*;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Jay\\Desktop\\tester.txt";
        StringBuilder reversed = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null) {
            reversed.append(new StringBuilder(line).reverse()).append("\n");
        }

        String reverseFileName = new StringBuilder(filePath.split("\\\\")[filePath.split("\\\\").length - 1].split("\\.")[0]).reverse().toString();
        List<String> filePathSplit = new java.util.ArrayList<>(List.of(filePath.split("\\\\")));
        filePathSplit.remove(filePathSplit.size() - 1);
        filePathSplit.add(reverseFileName + "." + filePath.split("\\\\")[filePath.split("\\\\").length - 1].split("\\.")[1]);
        String newFilePath = String.join("\\", filePathSplit);

        BufferedWriter writer = new BufferedWriter(new FileWriter(newFilePath));
        writer.write(reversed.toString());
        writer.close();
    }
}


