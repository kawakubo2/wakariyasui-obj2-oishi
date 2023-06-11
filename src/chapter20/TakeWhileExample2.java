package chapter20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TakeWhileExample2 {
    public static void main(String[] args) {
        Path path = Path.of("toshishun.txt");
        try (var reader = Files.newBufferedReader(path);) {
            reader.lines()
                .takeWhile(line -> line != null)
                .map(line -> line.replace("、", ",").replace("。", "."))
                .forEach(System.out::println);
            /*
            String line2;
            while ((line2 = reader.readLine()) != null) {
                System.out.println(line2.replace("、", ",").replace("。", "."));
            }
            */
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
