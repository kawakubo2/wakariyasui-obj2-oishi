package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DeleteExample1 {
    public static void main(String[] args) {
        try {
            Path path = Path.of("foo/bar/memo.txt");
            if (Files.exists(path)) {
                Files.delete(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
