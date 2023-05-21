package chapter19;
interface Function {
    int apply(String s);
}
public class Q1901 {
    public static void main(String[] args) {
        Function f = s -> s.length();
        System.out.println(strLength("山田太郎", f));
    }
    public static int strLength(String name, Function f) {
        return f.apply(name);
    }
}
