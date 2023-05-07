package chapter11.sample;

public class Polymorphism {
    public static void main(String[] args) {
        Version v;
        v = new Foo();
        System.out.println(v.getVersion());

        v = new Bar();
        System.out.println(v.getVersion());
    }
}