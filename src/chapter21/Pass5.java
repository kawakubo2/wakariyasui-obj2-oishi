package chapter21;

import static java.util.stream.Collectors.*;

public class Pass5 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        int totalOfDelo = sales.stream()
                            .filter(s -> "DELO".equals(s.pc().maker()))
                            .collect(summingInt(s -> s.pc().price() * s.quantity()));
        System.out.println("Delo製のパソコンの売上: " + totalOfDelo);
    }
}
