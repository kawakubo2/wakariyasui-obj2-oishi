package chapter20;

import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        var list = PC.getList();
        List<PC> sortedList = list.stream()
                                .sorted(Comparator.comparing(PC::price))
                                .toList();
        sortedList.forEach(System.out::println);
    }
                            
}
