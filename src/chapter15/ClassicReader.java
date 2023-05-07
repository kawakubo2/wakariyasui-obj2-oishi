package chapter15;

import java.io.BufferedReader;
import java.io.FileReader;

public class ClassicReader {
    public static void main(String[] args) {
        // try-with-resource文
        // BufferedReader in = Files.newBufferedReader(path);
        try (BufferedReader in = new BufferedReader(new FileReader("PathExample.java"));) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            
        }
    }
}
