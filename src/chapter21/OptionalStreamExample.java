package chapter21;

import java.util.List;
import java.util.Optional;

public class OptionalStreamExample {
    public static void main(String[] args) {
        Optional<String> opt = Optional.of("abc");
        List<String> ls = opt.stream()
                            .map(String::toUpperCase)
                            .toList();
        System.out.println("size:" + ls.size());
        ls.forEach(System.out::println);
    }
}
