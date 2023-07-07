package chapter21;

import java.util.OptionalDouble;

public class Q2104 {
    public static void main(String[] args) {
        var books = Book.getList();
        OptionalDouble average = books.stream()
                                .mapToInt(Book::price)
                                .average();
        System.out.printf("%.2f%n", average.getAsDouble());
    }
}
