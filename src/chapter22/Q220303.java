package chapter22;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Q220303 {
    public static void main(String[] args) {
        TemporalAdjuster nextFirstDay = TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjuster secondFriday = TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.FRIDAY);
        LocalDate date = LocalDate.now().with(nextFirstDay).with(secondFriday);
        System.out.println(date);
    }
}
