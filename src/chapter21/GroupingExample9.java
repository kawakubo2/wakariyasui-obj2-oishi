package chapter21;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;

public class GroupingExample9 {
    public static void main(String[] args) {
        var list = PC.getList();
        Map<Integer, List<PC>> typeGroup = list
                    .stream()
                    .collect(groupingBy(pc -> pc.price() / 10000));
        typeGroup.forEach((k, v) -> System.out.println((k * 10000 + 10000) + "円未満 = " + v));
    }
}
