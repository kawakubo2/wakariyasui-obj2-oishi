package chapter23;

import java.util.Arrays;
import java.util.List;

public class CompareExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("baseball", "Tennis", "Basketball", "swimming", "golf");
        list.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println(list);
    }
} 
