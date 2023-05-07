package chapter17;

import java.util.Map;

import lib.Input;

public class Pass4 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("cherry", "チェリー", "apple", "リンゴ", "pear", "ナシ", "banana", "バナナ", "grape", "ブドウ");

        int retry;
        do {
            String name = Input.getString("英語のフルーツ名: ");
            System.out.println(map.getOrDefault(name, "フルーツ"));
            retry = Input.getInt("続けますか?(1.続ける 9.中止する)");
        } while (retry == 1);
    }
}
