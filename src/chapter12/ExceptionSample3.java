package chapter12;

import lib.Input;

public class ExceptionSample3 {
    public static void main(String[] args) {
        int a = Input.getInt();
        int b = Input.getInt();
        Integer ans = div(a, b);
        if (ans != null) {
            System.out.printf("%d÷%d=%d%n", a, b, ans);
        } else {
            System.out.println("0で割ることはできません。");
        }
    }
    public static Integer div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return null; 
        }
    }
}
