package chapter04.q4_2;

import java.time.LocalDate;

public final class Book {
    private final String title;
    private final Author author;
    private final LocalDate date;
    public Book(String title, Author author, LocalDate date) {
        this.title = title;
        this.author = new Author(author.getName(), author.getBirthdate(), author.getAddress());
        this.date = date;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return new Author(author.getName(), author.getBirthdate(), author.getAddress());
    }
    public LocalDate getDate() {
        return date;
    }
}
