package chapter16;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        var list = new LinkedList<String>();
        list.add("たろう");
        list.add("はなこ");
        list.add("いちろう");
        list.forEach(System.out::println);
    }
}
