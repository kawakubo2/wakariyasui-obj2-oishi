package chapter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReplaceAllExample {
    public static void main(String[] args) {
        Path path = Path.of("abc.html");
        try (BufferedReader in = Files.newBufferedReader(path)) {
            in
            .lines()
            .forEach(s -> System.out.println(s.replaceAll("<.+?>", "")));

        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
