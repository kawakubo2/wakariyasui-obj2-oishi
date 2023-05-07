package chapter15.exercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class Pass2 {
    public static void main(String[] args) {
        Path path = Path.of("mydata.txt");
        try (PrintWriter out = new PrintWriter(path.toFile(), StandardCharsets.UTF_8)) {
            out.print(3001 + "\t");
            out.print("山田隆二" + "\t");
            out.println(70.2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
