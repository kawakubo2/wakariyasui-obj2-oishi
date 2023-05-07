package chapter01.exercise;

import java.time.LocalDate;

public class Q1_2 {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true),
            new Order("ICBK62", LocalDate.of(2025, 9, 2), 1050, 10, false),
            new Order("ICY62", LocalDate.of(2025, 7, 15), 1050, 12, true),
            new Order("ICC62", LocalDate.of(2025, 7, 27), 1050, 18, true),
            new Order("ICM65", LocalDate.of(2025, 8, 22), 1050, 9, false),
        };

        for (Order o: orders) {
            System.out.println(o);
        }
    }
}
