package chapter21;

import static java.util.stream.Collectors.*;

public class Pass3 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        String pcNames = sales.stream()
                                    .filter(s -> "大阪".equals(s.office()))
                                    .map(s -> s.pc().name())
                                    .distinct()
                                    .collect(joining(", "));
        System.out.println(pcNames);
    }
}
