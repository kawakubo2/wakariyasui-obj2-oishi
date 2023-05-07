package chapter13;

public class FinallySample1 {
    public static void main(String[] args) {
        try {
            System.out.println("start");
            // throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }
}
