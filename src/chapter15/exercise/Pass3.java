package chapter15.exercise;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Pass3 {
    public static void main(String[] args) {
        Path path = Path.of("mydata.txt");
        try (BufferedWriter out = Files.newBufferedWriter(path, StandardCharsets.UTF_8,
                                                StandardOpenOption.CREATE,
                                                StandardOpenOption.APPEND); 
        ) {
            out.write(3002 + "\t");
            out.write("鈴木一郎" + "\t");
            out.write(82.6 + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
