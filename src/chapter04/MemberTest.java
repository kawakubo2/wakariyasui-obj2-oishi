package chapter04;

public class MemberTest {
    public static void main(String[] args) {
        // IdNumber _id = new IdNumber(100);
        Member m = new Member(new IdNumber(100), "山田太郎");
        System.out.println(m);
        m.getId().setId(300);
        System.out.println(m);
    }
}
