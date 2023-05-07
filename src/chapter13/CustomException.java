package chapter13;

public class CustomException {
    public static void main(String[] args) {
        try {
            method();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
    public static void method() throws MyException {
        throw new MyException("★例外が発生しました。");
    }
}
