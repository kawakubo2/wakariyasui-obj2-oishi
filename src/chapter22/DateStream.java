package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class DateStream {
    public static void main(String[] args) {
        LocalDate startDay = LocalDate.of(2025, 2, 1);
        LocalDate endDay = LocalDate.of(2025, 3, 1);
        
        List<LocalDate> dates = startDay.datesUntil(endDay).toList();
        dates.forEach(System.out::println);

        startDay.datesUntil(endDay, Period.ofWeeks(1))
                .forEach(d -> System.out.printf("%12s", d));
        System.out.println();
    }
}
