package chapter06.sample.pk2;

import chapter06.sample.pk1.A;

public class B extends A {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a);
        B b = new B();
        b.print();
    }
}
