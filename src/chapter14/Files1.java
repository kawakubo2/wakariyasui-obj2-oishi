package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Files1 {
    public static void main(String[] args) {
        try {
            Path path = Path.of("PathExample.java");
            List<String> lines = Files.readAllLines(path);
            for (String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
