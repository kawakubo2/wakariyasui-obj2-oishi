package chapter12;

public class ExceptionMessage {
    public static void main(String[] args) {
        try {
            method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void method() throws Exception {
        throw new Exception("★例外が発生しました。");
    }
}
