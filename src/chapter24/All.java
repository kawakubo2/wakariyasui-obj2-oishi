package chapter24;

import java.util.Arrays;

public class All {
    public static void main(String[] args) {
        Arrays.stream(Color.values())
            .forEach(c -> System.out.println(c.name() + " : " + c.ordinal()));
    }
}
