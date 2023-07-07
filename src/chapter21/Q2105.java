package chapter21;

import java.util.Comparator;
import java.util.Optional;

public class Q2105 {
    public static void main(String[] args) {
        var books = Book.getList();
        Optional<Book> book = books
                                .stream()
                                .max(Comparator.comparing(Book::price));
        System.out.println(book.get().author());
    }
}