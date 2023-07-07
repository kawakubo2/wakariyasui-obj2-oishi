package chapter21;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;

public class GroupingExample {
    public static void main(String[] args) {
        var list = PC.getList();
        Map<String, List<PC>> typeGroup = list
                    .stream()
                    .collect(groupingBy(PC::type));
        typeGroup.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
