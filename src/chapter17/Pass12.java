package chapter17;

import java.util.HashMap;
import java.util.Map;

enum WEEK_OF_DAY { SUN, MON, TUE, WED, THU, FRI, SAT };
record Sale(String fruitName, WEEK_OF_DAY wod, int quantity) {}
public class Pass12 {
    public static void main(String[] args) {
        Sale[] sales = {
            new Sale("banana", WEEK_OF_DAY.SUN, 3),
            new Sale("apple", WEEK_OF_DAY.SUN, 5),
            new Sale("pear", WEEK_OF_DAY.SUN, 2),
            new Sale("banana", WEEK_OF_DAY.SUN, 5),
            new Sale("orange", WEEK_OF_DAY.TUE, 4),
            new Sale("apple", WEEK_OF_DAY.TUE, 2),
            new Sale("apple", WEEK_OF_DAY.WED, 7),
            new Sale("banana", WEEK_OF_DAY.WED, 10),
            new Sale("grape", WEEK_OF_DAY.THU, 3),
            new Sale("cherry", WEEK_OF_DAY.THU, 10),
            new Sale("banana", WEEK_OF_DAY.THU, 12),
            new Sale("grape", WEEK_OF_DAY.FRI, 7),
            new Sale("banana", WEEK_OF_DAY.FRI, 6),
            new Sale("orange", WEEK_OF_DAY.FRI, 4),
            new Sale("grape", WEEK_OF_DAY.FRI, 3),
            new Sale("banana", WEEK_OF_DAY.FRI, 3),
            new Sale("apple", WEEK_OF_DAY.SAT, 12),
            new Sale("pear", WEEK_OF_DAY.SAT, 8),
            new Sale("banana", WEEK_OF_DAY.SAT, 15),
            new Sale("apple", WEEK_OF_DAY.SAT, 7),
        };
        Map<WEEK_OF_DAY, Map<String, Integer>> counter = new HashMap<>();
        for (Sale sale: sales) {
            if (counter.containsKey(sale.wod())) {
                var fruitCounter = counter.get(sale.wod());
                if (fruitCounter.containsKey(sale.fruitName())) {
                    fruitCounter.put(sale.fruitName(), fruitCounter.get(sale.fruitName()) + sale.quantity());
                } else {
                    fruitCounter.put(sale.fruitName(), sale.quantity());
                }
            } else {
                var map = new HashMap<String, Integer>();
                map.put(sale.fruitName(), sale.quantity());
                counter.put(sale.wod(),  map);
            }
        }
        for (Map.Entry<WEEK_OF_DAY, Map<String, Integer>> entry: counter.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            for (Map.Entry<String, Integer> fruitEntry: entry.getValue().entrySet()) {
                System.out.print(" " + fruitEntry.getKey() + " ---> " + fruitEntry.getValue());
            }
            System.out.println();
        }

    }   
}
