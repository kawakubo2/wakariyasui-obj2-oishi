package chapter21;

import java.util.List;
import java.util.Optional;

public class OptionalStreamExample2 {
    public static void main(String[] args) {
        var list = List.of(
            Optional.of("abc"),
            Optional.empty(),
            Optional.of("def")
        );
        var ls = list.stream()
            .flatMap(Optional::stream)
            .toList();
        ls.forEach(System.out::print);
        System.out.println();
    }
}
