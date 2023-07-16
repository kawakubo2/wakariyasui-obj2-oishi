package chapter22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q220401 {
    public static void main(String[] args) {
        LocalDateTime datetime = LocalDateTime.of(2025, 1, 13, 15, 20, 15);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y年M月d日 ahh時mm分ss秒");
        System.out.println(datetime.format(fmt));
    }
}
