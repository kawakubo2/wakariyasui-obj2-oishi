package chapter24;

public class Pass2 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> b.genre() == Genre.SCIENCE)
            .map(Book::title)
            .forEach(System.out::println);
    }
}