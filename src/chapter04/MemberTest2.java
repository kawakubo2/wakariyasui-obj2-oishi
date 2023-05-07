package chapter04;

public class MemberTest2 {
    public static void main(String[] args) {
        IdNumber id = new IdNumber(100);
        Member m = new Member(id, "田中宏");
        System.out.println(m);

        IdNumber _id = m.getId();
        _id.setId(200);
        System.out.println(m);
        System.out.println("idは_idは別インスタンスである。" + (id != _id));
    }
}
