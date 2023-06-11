package chapter20;

import java.util.Comparator;
import java.util.List;

public class SkipLimitExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<PC> limitedPCs = 
            list.stream()
                .sorted(Comparator.comparing(PC::price))
                .skip(3)
                .limit(3)
                .toList();
        limitedPCs.forEach(System.out::println);

    }
}
