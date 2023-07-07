package chapter21;

import static java.util.stream.Collectors.*;

import java.util.Map;

public class Pass6 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        Map<String, Integer> salesMap = sales.stream()
                                            .collect(groupingBy(Sales::name, summingInt(s -> s.pc().price() * s.quantity())));
        salesMap.forEach((name, total) -> System.out.println(name + ": " + total));
    }
}
