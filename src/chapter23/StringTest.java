package chapter23;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "";
        String s2 = "\t";
        String s3 = "\n";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        System.out.println(s1.isBlank());
        System.out.println(s2.isBlank());
        System.out.println(s3.isBlank());
    }
}
