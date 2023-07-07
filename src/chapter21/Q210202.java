package chapter21;

import java.util.Map;
import static java.util.stream.Collectors.*;

public class Q210202 {
    public static void main(String[] args) {
        var list = Book.getList();
        Map<Integer, String> bookMap =
            list.stream()
                .collect(toMap(Book::number, Book::title)); 
        bookMap.forEach((number, title) -> System.out.println(number + " = " + title));
    }
}
