package fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

public class CSVProductReader implements ProductReadable {
    public Map<String, Product> getProducts() throws IOException {
        Map<String, Product> result = new LinkedHashMap<>();
        Path path = Path.of("product.txt");
        try (BufferedReader reader = Files.newBufferedReader(path);) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] tmp = line.split(",");
                result.put(tmp[0], new Product(tmp[0], tmp[1], tmp[2], Double.parseDouble(tmp[3]), Integer.parseInt(tmp[4])));
            }
        }
        return result;
    }
}
