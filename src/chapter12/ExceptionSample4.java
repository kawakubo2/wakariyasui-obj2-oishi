package chapter12;

import lib.Input;

public class ExceptionSample4 {
    public static void main(String[] args) {
        while(true) {
            try {
                int a = Input.getInt();
                int b = Input.getInt();
                int ans = div(a, b);
                System.out.printf("%d÷%d=%d%n", a, b, ans);
                break;
            } catch (ArithmeticException e) {
                System.out.println("0で割る計算は出来ません。");
            }
        }
    }
    public static Integer div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
