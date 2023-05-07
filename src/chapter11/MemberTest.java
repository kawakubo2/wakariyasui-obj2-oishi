package chapter11;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member(1234, "田中一郎");
        System.out.println("id: " + m.getId());
        System.out.println("名前: " + m.getName());
        System.out.println("バージョン: " + m.getVersion());

        Version v = new Member(2345, "横山花子");
        System.out.println(v.getVersion());
    }
}
