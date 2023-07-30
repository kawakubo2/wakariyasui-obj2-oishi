package chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConstructorExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = Files.readAllBytes(Path.of("nagasaki.txt"));
        String str = new String(bytes, "UTF-8");
        System.out.println(str);
    }
}
