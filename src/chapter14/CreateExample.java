package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample {
    public static void main(String[] args) {
        Path path = Path.of("temp");
        try {
            Files.createDirectory(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
