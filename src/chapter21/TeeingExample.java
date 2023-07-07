package chapter21;

import static java.util.stream.Collectors.*;
import java.util.Set;

import chapter20.Book;

record Info(Set<String> authors, Long books) {}
public class TeeingExample {
    public static void main(String[] args) {
        var list = Book.getList();
        Info info = list.stream()
                        .collect(
                            teeing(
                                mapping(Book::author, toSet()),
                                counting(),
                                Info::new
                            )
                        );
        System.out.println(info);
    }
}