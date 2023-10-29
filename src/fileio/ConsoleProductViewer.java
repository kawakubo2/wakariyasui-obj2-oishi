package fileio;

import java.util.Map;

public class ConsoleProductViewer implements ProductVisible {
    public void view(Map<String, Product> productMap) {
        System.out.println("コード  製品名              製品情報                          単価    重量");
        for (String code: productMap.keySet()) {
            Product product = productMap.get(code);
            System.out.printf("%-8s%-20s%-30s%8.2f%8d\n",
                product.getCode(),
                product.getName(),
                product.getDesc(),
                product.getUnitPrice(),
                product.getWeight()
            );
        }
    }
}
