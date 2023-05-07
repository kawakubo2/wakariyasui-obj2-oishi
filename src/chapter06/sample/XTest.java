package chapter06.sample;

public class XTest {
    public static void main(String[] args) {
        X x1 = new X("山田太郎");
        X x2 = new X("田中一郎");
        System.out.println(x1.getName());
        x1.friend(x2);
    }
}
