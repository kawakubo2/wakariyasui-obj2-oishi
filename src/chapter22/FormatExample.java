package chapter22;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(9999, 12, 31);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y年MM月dd日 eeee");
        System.out.println(date.format(fmt));
    }
}
