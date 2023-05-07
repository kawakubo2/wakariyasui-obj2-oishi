package chapter15.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass1 {
    public static void main(String[] args) {
        Path path = Path.of("openjdk.txt");
        try (BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            String line;
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
