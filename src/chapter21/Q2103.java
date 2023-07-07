package chapter21;

import java.util.Optional;

public class Q2103 {
    public static void main(String[] args) {
        var books = Book.getList();
        Optional<String> authors = books.stream()
                        .map(Book::author)
                        .distinct()
                        .reduce((result, name) -> result + " " + name);
        System.out.println(authors.orElseGet(() -> ""));
    }
}
