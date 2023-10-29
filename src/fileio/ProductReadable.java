package fileio;

import java.util.Map;

public interface ProductReadable {
    Map<String, Product> getProducts() throws Exception;
}
