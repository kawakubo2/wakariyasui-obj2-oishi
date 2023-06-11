package chapter20;

import java.util.List;

public class MapMultiExample {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3, 4, 5);
        list.stream()
            .mapMulti((n, buffer) -> {
                buffer.accept(n);
                buffer.accept(n * 10);
                buffer.accept(n * 100);
            })
            .forEach(System.out::print);

        System.out.println();
    } 
}
