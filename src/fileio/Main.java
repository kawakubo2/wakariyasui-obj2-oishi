package fileio;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("--- 製品リスト ---");
            ProductReadable productRreader = new JSONProductReader();
            Map<String, Product> productMap = productRreader.getProducts();
            ProductVisible viewer = new ConsoleProductViewer();
            viewer.view(productMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
