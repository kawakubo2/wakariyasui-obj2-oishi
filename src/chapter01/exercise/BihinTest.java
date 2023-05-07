package chapter01.exercise;

import java.time.LocalDate;

public class BihinTest {
    public static void main(String[] args) {
        Bihin[] bihins = {
            new Bihin("パソコン", LocalDate.of(2013,3,10), 105000, 5),
            new Bihin("スキャナー", LocalDate.of(2010, 7, 21), 62500, 1),
            new Bihin("書架", LocalDate.of(2015, 10, 1), 138800, 2),
        };

        System.out.println("---< 問2 >---");
        for (Bihin b: bihins) {
            System.out.println(b);
        }

        System.out.println("---< 問3 >---");
        System.out.println("変更前:" + bihins[0].getDate());
        bihins[0].setDate(LocalDate.of(2013, 4, 1));
        System.out.println("変更前:" + bihins[0].getDate());
    
        System.out.println("---< 問4 >---");
        LocalDate specDate = LocalDate.of(2013, 1, 1);
        for (Bihin b: bihins) {
            if (b.isAfterBihin(specDate)) {
                System.out.println(b);
            }
        }

    }
}
