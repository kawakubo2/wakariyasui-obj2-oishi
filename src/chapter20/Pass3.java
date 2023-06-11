package chapter20;

import java.util.Comparator;

public class Pass3 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> "田中宏".equals(b.author()))
            .sorted(Comparator.comparing(Book::price))        
            .forEach(System.out::println);
    }
}
