package chapter13.sample1;

public class CannotGetLessonRecordException extends Exception {
    public CannotGetLessonRecordException(String message) {
        super(message);
    }
    public CannotGetLessonRecordException() {}
}