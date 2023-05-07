package chapter03;

import java.io.IOException;
import java.time.LocalDate;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("A10001", "炊飯器5合炊き", 28000, LocalDate.of(2023, 2, 1), true);
        System.out.println(p1);
        Product p2 = new Product("L20001", "パルック10段階調節可能", 12800);
        System.out.println(p2);
        Product p3 = null;
        try {
            p3 = new Product("product.txt");
            System.out.println(p3);
        } catch(IOException e) {
            System.out.println(e);
        }
        Product p4 = new Product();
        System.out.println(p4);
    }
}
