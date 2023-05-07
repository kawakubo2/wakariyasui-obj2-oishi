package chapter11.interface_test;

public class A {
    private IB b;
    public A(IB b) {
        this.b = b;
    }
    public void run() {
        b.x();
        while(b.y()) {
            b.z();
        }
    }
}
