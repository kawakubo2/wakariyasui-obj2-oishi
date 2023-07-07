package chapter22;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class JapaneseFormat {
    public static void main(String[] args) {
        var date = LocalDate.of(2021, 7, 13);
        JapaneseDate jdate = JapaneseDate.from(date);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("GGGGGy年MM月dd日 eeee"); // G5つのでT,S,H,R
        System.out.println(jdate.format(fmt));

    }
}
