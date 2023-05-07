package chapter03;

public class AdderTest {
    public static void main(String[] args) {
        Adder adder = new Adder(100);
        adder.add();
        adder.add();
        System.out.println("number=" + adder.getNumber());
    }
}
