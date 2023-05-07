package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Q140203 {
    public static void main(String[] args) {
        try {
            Path p1 = Path.of("tanaka/data/list.txt");
            Path p2 = Path.of("tanaka/ref/list.txt");
            Files.copy(p1, p2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
