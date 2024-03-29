package fileio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONProductReader implements ProductReadable {
    public Map<String, Product> getProducts() throws IOException, JsonParseException {
        Map<String, Product> result = new HashMap<>();
        String data = Files.readString(Path.of("products.json"), StandardCharsets.UTF_8);
        ObjectMapper mapper = new ObjectMapper();

        Product[] products = mapper.readValue(data, Product[].class);
        for (Product p: products) {
           result.put(p.getCode(), p); 
        }
        return result;
    }
}
