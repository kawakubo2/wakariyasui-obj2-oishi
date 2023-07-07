package chapter21;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class Pass7 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        Map<String, Integer> salesMap = sales.stream()
                                            .collect(groupingBy(Sales::name, summingInt(s -> s.pc().price() * s.quantity())));
        System.out.println("------< 担当者別売上 >------");
        salesMap.forEach((name, total) -> System.out.println(name + ": " + total));

        Optional<Entry<String, Integer>> max = salesMap.entrySet().stream().max(Comparator.comparing(s -> s.getValue()));
        System.out.println("------< 最高売上 >------");
        System.out.println(max.get().getKey() + ": " + max.get().getValue() + "円");

    }
}
