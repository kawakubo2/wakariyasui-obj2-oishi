package chapter13;

public class BadColorException extends RuntimeException {
    public BadColorException(String message) {
        super(message);
    }
    public BadColorException() {}
}
