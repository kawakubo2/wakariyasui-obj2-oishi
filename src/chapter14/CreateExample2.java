package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateExample2 {
    public static void main(String[] args) {
        try {
            Path path = Path.of("foo/bar");
            Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
