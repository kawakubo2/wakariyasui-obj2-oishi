package chapter21;

import java.util.List;

public class Reduce0Example {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream()
                    .filter(n -> n % 2 == 0)
                    .reduce(0, (total, n) -> total + n);
        System.out.println(sum);
    }
}
