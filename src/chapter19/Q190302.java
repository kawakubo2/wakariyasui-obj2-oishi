package chapter19;

import java.util.function.BiFunction;
import java.util.function.Predicate;

import lib.Input;

record Student(int id, String name) {}

public class Q190302 {
    public static void main(String[] args) {
        /*
        final String title = "わかりやすいJavaオブジェクト指向編";
        final int pos = 6;
        BiFunction<String, Integer, Character> bif = (s, n) -> s.charAt(n);    
        System.out.println(bif.apply(title, pos));
        */
        System.out.println("---< B >---");
        print((s, i) -> s.charAt(i));
        print(String::charAt);
        System.out.println("---< C >---");
        String msg = "Hello";
        String msg2 = "JavaScript";
        print2(msg, msg::equals);
        print2(msg2, msg2::contains);
        System.out.println("---< C >---");
        print3(Student::new);
    }
    public static void print(BiFunction<String, Integer, Character> bif) {
        String name = Input.getString("名前");
        int pos = Input.getInt("インデックス");
        System.out.println(bif.apply(name, pos));
    }
    public static void print2(String str, Predicate<String> p) {
        System.out.println(p.test(str));
    }
    public static void print3(BiFunction<Integer, String, Student> bif) {
        int id = Input.getInt("学籍番号");
        String name = Input.getString("名前");
        System.out.println(bif.apply(id, name));
    }
}
