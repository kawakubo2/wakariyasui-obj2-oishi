package chapter21;

import static java.util.stream.Collectors.*;

public class Pass1 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        int sum = sales.stream()
                    .collect(summingInt(s -> s.pc().price() * s.quantity()));
        System.out.println("合計金額: " + sum);
    }
}
