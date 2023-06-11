package chapter20;

import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        var fruits = List.of("banana", "peach", "apple", "strawberry");
        fruits.stream()
            .sorted((s1, s2) -> s1.length() - s2.length())
            .forEach(System.out::println);
    }
}
