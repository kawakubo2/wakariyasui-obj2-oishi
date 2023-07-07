package chapter21;

import java.util.Optional;
import static java.util.stream.Collectors.*;

import java.util.Comparator;

public class Q210204 {
    public static void main(String[] args) {
        var list = Book.getList();
        Optional<Book> maxPriceBook =
            list.stream()
                .collect(maxBy(Comparator.comparing(Book::price)));
        System.out.println(maxPriceBook.get());
    }
}
