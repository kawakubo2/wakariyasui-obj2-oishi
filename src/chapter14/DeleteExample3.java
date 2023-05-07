package chapter14;

import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;

public class DeleteExample3 {
    public static void main(String[] args) {
        try {
            Path target = Path.of("foo");
            FileUtils.deleteDirectory(target.toFile());
        } catch(IOException e) {
            e.printStackTrace();
        } 
    }
}
