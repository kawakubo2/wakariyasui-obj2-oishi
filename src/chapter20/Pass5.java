package chapter20;

public class Pass5 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .map(Book::genre)
            .distinct()
            .sorted()
            .forEach(System.out::println);
    }
}
