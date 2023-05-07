package chapter11;

public class X implements C {
    @Override
    public void bye() {
        System.out.println("bye");
    }
    @Override
    public void talk() {
        System.out.println("talk");
    }
    @Override
    public void hello() {
        System.out.println("hello");
    }
}
