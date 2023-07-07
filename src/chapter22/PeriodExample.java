package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1998, 7, 13);
        LocalDate today = LocalDate.now();
        long days = ChronoUnit.DAYS.between(birthday, today);
        long months = ChronoUnit.MONTHS.between(birthday, today);
        long years = ChronoUnit.YEARS.between(birthday, today);
        System.out.println(days);
        System.out.println(months);
        System.out.println(years);

        Period period = Period.between(birthday, today);
        System.out.print(period.getYears()  + "歳 ");
        System.out.print(period.getMonths()  + "か月 ");
        System.out.println(period.getDays()  + "日");
    }
}
