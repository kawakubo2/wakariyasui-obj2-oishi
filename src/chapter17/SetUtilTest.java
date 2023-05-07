package chapter17;

import java.util.Arrays;
import java.util.HashSet;

public class SetUtilTest {
    public static void main(String[] args) {
        SetUtils<Integer> util = new SetUtils<>(SetType.LINKED_HASH);
        var set1 = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        var set2 = new HashSet<Integer>(Arrays.asList(1, 2, 4, 8, 16, 32, 64));
        System.out.println("set1:" + set1.toString());
        System.out.println("set2:" + set2.toString());
        System.out.println("---union---");
        System.out.println("set1.union(set2): " + util.union(set1, set2).toString());
        System.out.println("---intersect---");
        System.out.println("set1.intersect(set2): " + util.intersect(set1, set2).toString());
        System.out.println("---except---");
        System.out.println("set1.except(set2): " + util.except(set1, set2).toString());
    }
}
