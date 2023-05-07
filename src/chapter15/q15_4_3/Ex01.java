package chapter15.q15_4_3;

import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Path path = Path.of("order.txt");
        try (Scanner in = new Scanner(path, StandardCharsets.UTF_8)) {
            while(in.hasNext()) {
                String code = in.next();
                String date = in.next();
                int quantity = in.nextInt();
                System.out.println(code + "/" + date + "/" + quantity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
