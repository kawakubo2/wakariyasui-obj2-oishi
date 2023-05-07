package chapter18;

public class FooTest {
    public static void main(String[] args) {
        Foo<Integer> foo1 = new Foo<>(12);
        foo1.setObj(30);
        System.out.println(foo1.getObj());
        
        Foo<String> foo2 = new Foo<>("こんにちは、世界！");
        foo2.setObj("こんにちは、Java！");
        System.out.println(foo2.getObj());
    }
}
