package chapter22;

import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Pass1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2028, 7, 21);
        Period p = Period.between(LocalDate.of(2022, 2, 1), date);
        
        System.out.println("--- (1) ---");
        JapaneseDate jdate = JapaneseDate.from(date);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("Gy年MM月dd日");
        System.out.println(jdate.format(fmt));
        
        System.out.println("オリンピックまであと" + p.getYears() + "年" + p.getMonths() + "月" + p.getDays() + "日");
    }
}
