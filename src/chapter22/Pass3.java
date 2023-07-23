package chapter22;

import java.time.Duration;
import java.time.LocalTime;

record Runner(String name, LocalTime start, LocalTime goal) {}
public class Pass3 {
    public static void main(String[] args) {
        Runner r1 = new Runner("田中宏", LocalTime.of(9, 12, 30), LocalTime.of(14, 15, 10));
        Runner r2 = new Runner("鈴木次郎", LocalTime.of(9, 35, 20), LocalTime.of(15, 44, 20));
        printRunnerRecord(r1);
        printRunnerRecord(r2);
        Duration diff = diff(r1, r2);
        printRunnersDiff(diff);
    }
    private static Duration calcRecord(LocalTime start, LocalTime end) {
        return Duration.between(end, start);
    }
    private static void printRunnerRecord(Runner r) {
        Duration d = Duration.between(r.start(), r.goal());
        System.out.printf("%-8s %2d時間 %2d分 %2d秒%n", 
            r.name(), d.toHoursPart(), d.toMinutesPart(), d.toSecondsPart());
    }
    private static Duration diff(Runner r1, Runner r2) {
        Duration d1 = calcRecord(r1.goal(), r1.start());
        Duration d2 = calcRecord(r2.goal(), r2.start());
        return d2.minus(d1);
    }
    private static void printRunnersDiff(Duration diff) {
        System.out.printf("時間差 %2d時間 %2d分 %2d秒%n", 
            diff.toHoursPart(), diff.toMinutesPart(), diff.toSecondsPart());
    }
}
