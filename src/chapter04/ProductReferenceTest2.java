package chapter04;

import java.time.LocalDate;

import chapter03.Product;

public class ProductReferenceTest2 {
    public static void main(String[] args) {
        Product p1 = new Product("A100", "XenPad", 35760,
            LocalDate.of(2016, 9, 16), true);

        sub(p1);
        System.out.println("p1=" + p1);
    
        /*
         * 参考テスト（基本データ型の場合)
         */
        int n = 10;
        sub2(n);
        System.out.println("n  =" + n);
    }
    public static void sub(Product p) {
        p = new Product("B200", "XPS8950", 240000);
        p.setPrice(40200);
        System.out.println("p= " + p);
    }
    public static void sub2(int num) {
        num -= 10;
        System.out.println("num=" + num);
    }
}
