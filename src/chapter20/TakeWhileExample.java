package chapter20;

import java.util.List;

public class TakeWhileExample {
    public static void main(String[] args) {
        var list = List.of(9, 6, 5, 5, 2, 1, 8, 5, 4, 9);
        list.stream()
            .takeWhile(n -> n >= 5)
            .forEach(n -> System.out.print(n + " "));

        System.out.println();
    }
    
}
