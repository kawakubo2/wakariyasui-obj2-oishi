package chapter21;

import static java.util.stream.Collectors.*;

public class Q210203 {
    public static void main(String[] args) {
        var list = Book.getList();
        String genreList = list.stream()
                            .map(Book::genre)
                            .distinct()
                            .collect(joining(", "));
        System.out.println(genreList);
    }
}
