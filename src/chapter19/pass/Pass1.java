package chapter19.pass;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

record Book(int code, String title, int price) {}
record Student(int id, String name) {
    public Student() {
        this(100, "田中宏");
    }
}
public class Pass1 {
    public static void main(String[] args) {
        Supplier<Student> s = () -> new Student();
        System.out.println(s.get());

        final String s2 = "Java";
        Predicate<String> p = s1 -> s1.contains(s2);
        System.out.println(p.test("JavaScript"));

        final String s3 = "JAVA";
        p = s1 -> s1 != null && s1.equalsIgnoreCase(s3);
        System.out.println(p.test("Java"));

        var student = new Student(111, "横山花子");
        Consumer<Student> m = st -> System.out.println(st.name());
        m.accept(student);

        printAboutBook(b -> b.price());
        printAboutBook(b -> b.title().length());
    }
    
    public static void printAboutBook(Function<Book, Integer> f) {
        var book = new Book(1234, "簡単SpringBoot3", 2800);
        System.out.println(f.apply(book));
    }
}
