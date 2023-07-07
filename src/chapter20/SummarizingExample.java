package chapter20;
import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;
public class SummarizingExample {
    public static void main(String[] args) {
        var list = Book.getList();
        IntSummaryStatistics stat =
            list.stream()
                .collect(summarizingInt(Book::price));

        System.out.println("件数: " + stat.getCount());
        System.out.println("合計: " + stat.getSum());
        System.out.println("平均: " + stat.getAverage());
        System.out.println("最高値: " + stat.getMax());
        System.out.println("最安値: " + stat.getMin());
    }
}
