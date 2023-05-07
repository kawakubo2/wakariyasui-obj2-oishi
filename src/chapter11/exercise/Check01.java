package chapter11.exercise;

public class Check01 implements CheckNumber{
    @Override
    public boolean test(int n) {
        return n < 50 || n > 100;
    }
}
