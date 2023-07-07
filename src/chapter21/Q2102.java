package chapter21;

import java.util.Optional;

public class Q2102 {
    public static void main(String[] args) {
        var books = Book.getList();
        Optional<Book> b = books.stream()
                        .filter(book -> "木村花子".equals(book.author()))
                        .findFirst();
        System.out.println(b.get());

    }
    
}
