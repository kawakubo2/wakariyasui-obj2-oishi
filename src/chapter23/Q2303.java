package chapter23;

public class Q2303 {
    public static void main(String[] args) {
        String[] ok = {"A10_20", "123ABC", "__AB9", "XYZ1"};
        String[] ng = {"A123456", "Abc123", "$A123", "XYX-10"};
        System.out.println("---< 正常系テスト >---");
        for (String s: ok) {
            System.out.print(s + ": ");
            if (s.matches("^(?=.*[A-Z0-9])(?!.*[a-z])(?!.*\\W).{4,6}$")) {
                System.out.println("○");
            } else {
                System.out.println("×");
            }
        }
        System.out.println("---< 異常系テスト >---");
        for (String s: ng) {
            System.out.print(s + ": ");
            if (s.matches("^(?=.*[A-Z])(?!.*[a-z])(?!.*\\W).{4,6}$")) {
                System.out.println("○");
            } else {
                System.out.println("×");
            }
        }
    }
}
