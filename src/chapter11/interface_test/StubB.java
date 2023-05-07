package chapter11.interface_test;

import java.util.Random;

public class StubB implements IB {

    public void x() {
        System.out.println("StubB#xメソッド");
    }
    public boolean y() {
        Random r = new Random();
        int rand = r.nextInt(101);
        return rand <= 80 ? true : false;
    }
    public void z() {
        System.out.println("StubB#疑似zメソッド");
    }
    
}
