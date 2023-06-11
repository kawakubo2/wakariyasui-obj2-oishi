package chapter20;

import java.util.Comparator;

public class Pass4 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .sorted(Comparator.comparing(Book::price))
            .skip(2)
            .limit(3)
            .forEach(System.out::println);
    }
    
}
