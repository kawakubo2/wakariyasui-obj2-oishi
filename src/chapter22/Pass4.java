package chapter22;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pass4 {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.of(2025, 2, 21, 13, 0, 0);
        LocalDateTime dt2 = LocalDateTime.of(2026, 5, 7, 10, 15, 30);

        LocalDateTime dt3 = dt1.plusMinutes(3245).plusSeconds(320);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y/M/d ah:m:s");
        System.out.println(dt3.format(fmt));

        Duration d = Duration.between(dt1, dt2);
        System.out.printf("全期間は%d秒間%n", d.toSeconds());

    }
}
