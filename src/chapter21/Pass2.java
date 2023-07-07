package chapter21;

import static java.util.stream.Collectors.*;

public class Pass2 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        var totalOfTokyo = sales.stream()
                                .filter(s -> "東京".equals(s.office()))
                                .collect(summingInt(s -> s.pc().price() * s.quantity()));
        System.out.println("東京支社の売り上げ: " + totalOfTokyo);
    }
}
