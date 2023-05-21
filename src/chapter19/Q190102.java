package chapter19;

interface Predicate {
    boolean test(String color);
}
public class Q190102 {
    public static void main(String[] args) {
        Predicate p = s -> "blue".equals(s);
        System.out.println(color("blue", p));
        System.out.println(color("red", p));
    }
    public static boolean color(String color, Predicate p) {
        return p.test(color);
    }
}
