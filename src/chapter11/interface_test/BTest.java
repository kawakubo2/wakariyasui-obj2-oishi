package chapter11.interface_test;

public class BTest {
    public static void main(String[] args) {
        A a = new A(new SuperB());
        a.run();
    }
}
