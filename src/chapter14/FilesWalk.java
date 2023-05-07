package chapter14;

import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Stream;

public class FilesWalk {
    public static void main(String[] args) {
        try {
            Path path = Path.of(".");
            List<Path> plist;
            try (Stream<Path> walk = Files.walk(path);) {
                plist = walk.filter(Files::isRegularFile)
                            .toList();
            }
            plist.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
