package chapter15;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class newBufferedReaderExample {
    public static void main(String[] args) {
        Path path = Path.of("nagasaki");
        // try-with-resource文
        try (BufferedReader in = Files.newBufferedReader(path);) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
