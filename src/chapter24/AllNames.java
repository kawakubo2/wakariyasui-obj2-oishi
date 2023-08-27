package chapter24;

import java.util.Arrays;

public class AllNames {
    public static void main(String[] args) {
        Color[] values = Color.values();
        Arrays.stream(values)
            .forEach(System.out::println);

    }
}
