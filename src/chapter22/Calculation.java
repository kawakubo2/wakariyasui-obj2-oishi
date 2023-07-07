package chapter22;

import java.time.LocalDate;

public class Calculation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newDay = today.plusYears(3).plusMonths(8).plusDays(10);
        System.out.println(today);
        System.out.println(newDay);
    }
}
