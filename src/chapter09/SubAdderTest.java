package chapter09;

public class SubAdderTest {
    public static void main(String[] args) {
        SubAdder subAdder = new SubAdder();
        subAdder.add();
        System.out.println(subAdder.getNumber());
        subAdder.add(10);
        System.out.println(subAdder.getNumber());
    }
    
}
