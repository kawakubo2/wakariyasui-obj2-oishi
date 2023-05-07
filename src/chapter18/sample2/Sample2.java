package chapter18.sample2;

import java.util.ArrayList;
import java.util.Comparator;

class Parent {
    private double key = Math.random();
    // 初期化子(コンストラクタの前に動く)
    {
        System.out.println(key);
    }
    public double key() {
        return key;
    }
}
class Child extends Parent {}
class keyComparator implements Comparator<Child> {
    @Override
    public int compare(Child d1, Child d2) {
        return Double.compare(d1.key(), d2.key());
    }
}
public class Sample2 {
    public static void main(String[] args) {
        var cList = new ArrayList<Child>();
        cList.add(new Child());
        cList.add(new Child());
        cList.add(new Child());
        cList.add(new Child());
        cList.add(new Child());

        System.out.println("---< ソート >---");
        cList.sort(Comparator.comparing(Child::key));
        // cList.sort(new keyComparator());

        for (Child c: cList) {
            System.out.println(c.key());
        }
    }
}
