package chapter12;

import lib.Input;

public class ExceptionSample2 {
    public static void main(String[] args) {
        int a = Input.getInt();
        int b = Input.getInt();
        if (b != 0) {
            System.out.printf("%d÷%d=%d%n", a, b, a / b);
        } else {
            System.out.println("0で割る計算はできません");
        }

    }
}
