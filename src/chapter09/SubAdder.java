package chapter09;

public class SubAdder extends Adder {
    public void add(int val) {
        setNumber(getNumber() + val);
    }
}
