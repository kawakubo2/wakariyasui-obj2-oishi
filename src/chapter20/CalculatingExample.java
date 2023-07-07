package chapter20;

import static java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.Optional;

public class CalculatingExample {
    public static void main(String[] args) {
        var list = Book.getList();

        long count = list.stream().collect(counting());
        int sum = list.stream().collect(summingInt(Book::price));
        double average = list.stream().collect(averagingInt(Book::price));
        Optional<Book> max = list.stream().collect(maxBy(Comparator.comparing(Book::price)));
        Optional<Book> min = list.stream().collect(minBy(Comparator.comparing(Book::price)));
        
        System.out.println("件数 = " + count);
        System.out.println("合計 = " + sum);
        System.out.println("平均 = " + average);
        System.out.println("最高値 = " + max.get().price());
        System.out.println("最安値 = " + min.get().price());
    }
}
