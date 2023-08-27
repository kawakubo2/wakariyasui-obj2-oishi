package chapter24;

import java.util.List;

public class SmartPhoneTest {
    public static void main(String[] args) {
        var list = List.of(
            new SmartPhone("100", Color.WHITE),
            new SmartPhone("101", Color.BLACK),
            new SmartPhone("102", Color.BLACK),
            new SmartPhone("103", Color.GOLD)
        );

        list.forEach(System.out::println);
    }
}
