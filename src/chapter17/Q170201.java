package chapter17;

import java.util.HashSet;

public class Q170201 {
    public static void main(String[] args) {
        var set = new HashSet<String>();
        set.add("やまだ");        
        set.add("たなか");
        set.add("いけだ");
        set.add("やまだ");        

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.remove("いけだ");

        for (String s: set) {
            System.out.println(s);
        }
    }
}
