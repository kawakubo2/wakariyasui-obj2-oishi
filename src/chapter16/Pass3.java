package chapter16;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Parking(int pnumber, LocalDate date, String number) {}
public class Pass3 {
    public static void main(String[] args) {
        List<Parking> list = Arrays.asList(
            new Parking(102, LocalDate.of(2025, 7, 8), "Y-111-222"),
            new Parking(205, LocalDate.of(2025, 10, 1), "Z-111-222"),
            new Parking(101, LocalDate.of(2025, 3, 12), "X-111-222")
        );

        list.sort(Comparator.comparing(Parking::pnumber));
        list.forEach(System.out::println);
   }
}
