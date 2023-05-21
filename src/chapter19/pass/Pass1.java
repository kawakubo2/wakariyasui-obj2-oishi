package chapter19.pass;

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
    }    
}
