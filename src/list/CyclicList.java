package list;

import java.util.ArrayList;
import java.util.List;

public class CyclicList {
    public static void main(String[] args) {
        List<String> names = List.of("Yamada", "Suzuki", "Tanaka");
        for (int i = 0; i < 54; i++) {
            System.out.println(names.get(i % names.size()));
        }
    }
}
