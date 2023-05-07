package chapter04;

import java.time.LocalDate;

import chapter03.Product;

public class ProductReferenceTest {
    public static void main(String[] args) {
        Product p1 = new Product("A100", "XenPad", 35760,
            LocalDate.of(2016, 9, 16), true);

        Product p2 = p1;

        p2.setPrice(40200);

        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);
        
        /* 
         * 参考テスト(基本データ型の場合)
         */
        int n1 = 10;
        int n2 = n1;

        n2 = 100;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
    }
}
