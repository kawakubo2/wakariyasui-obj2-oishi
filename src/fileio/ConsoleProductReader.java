package fileio;

import java.util.Map;

public class ConsoleProductReader implements ProductReadable {
    public Map<String, Product> getProducts() {
        // 製品リスト
        return Map.of(
            "K16", new Product("K16", "Wood screws", "brass 20mm pack of 50", 7.75, 250),
            "D24", new Product("D24", "Wood glue", "clear 1 letter", 5.50, 1000),
            "M93", new Product("M93", "Sand paper(M)", "medium grade 100 sheets", 10.25, 500),
            "M94", new Product("M94", "Sand paper(F)", "fine grade 100 sheets", 14.75, 100)
        );
    }
}
