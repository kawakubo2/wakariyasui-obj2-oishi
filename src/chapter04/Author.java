package chapter04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Author {
    private final String name;
    private final List<String> books;
    public Author(String name, List<String> books) {
        this.name = name;
        this.books = new ArrayList<>();
        for (String book: books) {
            this.books.add(book);
        }
    }
    public String getName() {
        return name;
    }
    public List<String> getBooks() {
        /*
        List<String> result = new ArrayList<>();
        for (String book: this.books) {
            result.add(book);
        }
        return result;
        */
        List<String> result = new ArrayList<>();
        Collections.copy(this.books, result);
        return result;
    }
}
