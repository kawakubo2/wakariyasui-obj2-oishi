package chapter21;

import java.util.Map;
import static java.util.stream.Collectors.*;

import java.util.List;

public class GroupingExample2 {
    public static void main(String[] args) {
        var list = PC.getList();
        Map<String, List<String>> typeGroup =
            list.stream()
                .collect(groupingBy(PC::type, mapping(PC::name, toList())));
        typeGroup.forEach((k, v) -> System.out.println((k + " = " + v)));
    }
}
