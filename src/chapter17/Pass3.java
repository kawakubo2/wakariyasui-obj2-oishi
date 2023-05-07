package chapter17;

import java.util.Map;

public class Pass3 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("cherry", "チェリー", "apple", "リンゴ", "pear", "ナシ", "banana", "バナナ", "grape", "ブドウ");
        for (Map.Entry<String, String> entry: map.entrySet()) {
            System.out.printf("%-10s - %-10s%n", entry.getKey(), entry.getValue());
        }
    }
}
