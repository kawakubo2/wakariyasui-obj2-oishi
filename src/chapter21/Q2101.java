package chapter21;

public class Q2101 {
    public static void main(String[] args) {
        var books = Book.getList();
        boolean result = books.stream()
                        .anyMatch(book -> "木村花子".equals(book.author()));
        System.out.println("木村花子さんの本は存在" + (result ? "する": "しない"));
    }
}
