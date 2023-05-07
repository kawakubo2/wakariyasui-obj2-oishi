package chapter14;

import java.nio.file.Path;

public class Pass1 {
    public static void main(String[] args) {
        Path p1 = Path.of("tanaka/text/note.txt");
        Path p2 = Path.of("tanaka/books");
        Path p3 = Path.of("tanaka/books/pdf/ref.pdf");
        Path p4 = Path.of("tanaka/hello.html");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

    }
}
