package chapter15.q15_4_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewBufferedWriterExample {
    public static void main(String[] args) {
        Path path = Path.of("data.txt");
        try (BufferedWriter out = Files.newBufferedWriter(path, Charset.forName("UTF-8"),
            StandardOpenOption.CREATE,
            StandardOpenOption.APPEND);) {
            
            out.write(110 + "\t");
            out.write("佐藤一郎" + "\t");
            out.write(73.2 + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
