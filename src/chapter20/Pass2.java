package chapter20;

public class Pass2 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> "NOVEL".equals(b.genre()))
            .map(Book::title)
            .forEach(System.out::println);
    }
}
