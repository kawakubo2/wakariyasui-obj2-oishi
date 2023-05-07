package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MoveExample9 {
    public static void main(String[] args) {
        try {
            Path source = Path.of("tanaka/data/list.txt");
            Path target = Path.of("tanaka/table.txt");
            Files.move(source, target);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
