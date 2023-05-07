package chapter12;

import lib.Input;

public class ExceptionExample {
    public static void main(String[] args) {
        int a = Input.getInt();
        int b = Input.getInt();

        /*
         * 以下は、bの0の場合、ArithmeticException(算術例外)が発生する
         */
        System.out.printf("%d÷%d=%d%n", a, b, a / b);
    }
}
