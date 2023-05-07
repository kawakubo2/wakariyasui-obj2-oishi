package chapter16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("おはよう");
        list.add("こんにちは");
        list.add("こんばんは");
        printList(list);
    }    
    public static void printList(List<String> list) {
        for (String s: list) {
            System.out.println(s);
        }
    }
}
