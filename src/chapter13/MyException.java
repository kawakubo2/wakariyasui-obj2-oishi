package chapter13;

public class MyException extends Exception {
    // private static final long serialVersionUID = 28L;
    public MyException(String message) {
        super(message);
    }
    public MyException() {}
}
