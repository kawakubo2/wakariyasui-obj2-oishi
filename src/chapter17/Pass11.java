package chapter17;

import java.util.HashMap;
import java.util.Map;

public class Pass11 {
    public static void main(String[] args) {
        /*
         * banana: 5
         * apple : 3
         * pear  : 1
         * orange: 2
         * grape : 3
         * cherry: 1
         */
        String[] fruits = 
        {
            "banana", "apple", "pear", "banana", "orange", "apple",
            "apple", "banana", "grape", "cherry", "banana", "grape",
            "banana", "orange", "grape"
        };
        var counter = new HashMap<String, Integer>();
        for (String fruitName: fruits) {
            if (counter.containsKey(fruitName)) {
                counter.put(fruitName, counter.get(fruitName) + 1);
            } else {
                counter.put(fruitName, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            System.out.printf("%-8s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
