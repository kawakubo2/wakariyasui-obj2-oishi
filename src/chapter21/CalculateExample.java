package chapter21;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CalculateExample {
    public static void main(String[] args) {
        var list = PC.getList();
        long count = list.stream().mapToInt(PC::price).count();
        int sum = list.stream().mapToInt(PC::price).sum();
        OptionalDouble average = list.stream().mapToInt(PC::price).average();
        OptionalInt max = list.stream().mapToInt(PC::price).max();
        OptionalInt min = list.stream().mapToInt(PC::price).min();
        System.out.println("件数 = " + count);
        System.out.println("合計 = " + sum);
        System.out.println("平均 = " + average.getAsDouble());
        System.out.println("最大 = " + max.getAsInt());
        System.out.println("最小 = " + min.getAsInt());
    }
    
}
