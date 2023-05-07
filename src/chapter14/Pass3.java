package chapter14;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Pass3 {
    public static void main(String[] args) {
        try {
            Path p1 = Path.of("nagasaki_ms932.txt");
            Path p2 = Path.of("nagasaki.txt");
            String contents = Files.readString(p1, Charset.forName("MS932"));
            Files.writeString(p2, contents);
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
