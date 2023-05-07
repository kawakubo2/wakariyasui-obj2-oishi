package chapter08;

import java.time.LocalDate;

public class MemberTest {
    public static void main(String[] args) {
        StudentMember stmem = new StudentMember(110, "田中宏", LocalDate.of(2004, 7, 30));
        Member mem = stmem;
        System.out.println(mem.getId());
        System.out.println(mem.getName());
        System.out.println(stmem.getBirthday());
        StudentMember stmem2 = (StudentMember)mem;
        System.out.println(stmem2.getBirthday());
        System.out.println(stmem2.expirationDate());
    }
}
