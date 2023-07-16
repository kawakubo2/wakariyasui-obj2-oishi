package chapter22;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample2 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime timelimit = now.plusHours(3).plusMinutes(15);
        System.out.println(timelimit.getHour() + "時" + timelimit.getMinute() + "分");
    }
}
