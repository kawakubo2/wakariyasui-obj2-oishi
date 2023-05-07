package chapter11;

public class PositiveOddSelector implements Selectable{

    @Override
    public boolean test(int n) {
        return n > 0 && n % 2 != 0;
    }
    
}
