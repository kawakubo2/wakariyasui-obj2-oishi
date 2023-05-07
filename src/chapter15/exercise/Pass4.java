package chapter15.exercise;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Pass4 {
    public static void main(String[] args) {
        Path path = Path.of("mydata.txt");
        try (Scanner in = new Scanner(path, StandardCharsets.UTF_8)) {
            while (in.hasNext()) {
                System.out.printf("|%s|%8s|%s|%8s|%s|\n", in.nextInt(), "", in.next(), "", in.nextDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
