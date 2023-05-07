package chapter14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass2 {
    public static void main(String[] args) {
        Path p1 = Path.of("tanaka/hello.html");
        Path p2 = Path.of("tanaka/html");
        Path p3 = Path.of("tanaka/html/hello.html");
        Path p4 = Path.of("tanaka");
        try {
            Files.createFile(p1);
            Files.createDirectory(p2);
            Files.move(p1, p3);
            System.out.println(p4.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
