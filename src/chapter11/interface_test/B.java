package chapter11.interface_test;

import java.util.Random;

public class B implements IB {
    public void x() {
        System.out.println("xメソッド");
    }
    public boolean y() {
        Random r = new Random();
        int rand = r.nextInt(101);
        return rand <= 80 ? true : false;
    }
    public void z() {
        System.out.println("zメソッド");
    }
}
