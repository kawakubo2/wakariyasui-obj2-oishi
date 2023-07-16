package chapter22;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Q220301 {
    public static void main(String[] args) {
        System.out.println("--- (1) ---");
        LocalDate today = LocalDate.now();
        LocalDate someday = today.plusYears(2).plusMonths(3);
        System.out.println(someday);
        System.out.println();

        System.out.println("--- (2) ---");
        LocalDate d1 = LocalDate.of(2022, 1, 1);
        LocalDate d2 = LocalDate.of(2024, 7, 16);
        long days = ChronoUnit.DAYS.between(d1, d2);
        System.out.printf("%s～%sまで%d日あります。%n", d1, d2, days);
        System.out.println();

        System.out.println("--- (3) ---");
        boolean before = d1.isBefore(d2);
        if (before) {
            System.out.printf("%sは%sより前の日付です。%n", d1, d2);
        } else {
            System.out.printf("%sは%sより以降の日付です。%n", d1, d2);
        }
    }
}
