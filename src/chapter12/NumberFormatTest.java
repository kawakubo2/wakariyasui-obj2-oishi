package chapter12;

public class NumberFormatTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("整数値の引数が必要です");
            System.exit(-1);
        }
        try {
            int num = Integer.parseInt(args[0]);
            System.out.printf("%dの2乗は%dです%n", num, num * num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
