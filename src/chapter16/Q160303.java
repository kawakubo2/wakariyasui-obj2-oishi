package chapter16;

import java.util.Arrays;
import java.util.Comparator;

record Population(String prefecture, int population, double rate) {}

public class Q160303 {
    public static void main(String[] args) {
        Population[] populations = {
            new Population("北海道", 5250, 6.8),
            new Population("東京都", 13921, 7.1),
            new Population("大阪府", 8809, 0.4),
            new Population("福岡県", 5250, 0.7),
            new Population("沖縄県", 1453, 3.9),
        };
        var list = Arrays.asList(populations);
        list.sort(Comparator.comparing(Population::population));
        // list.forEach(p -> System.out.println(p));
        list.forEach(System.out::println);
    }    
}
