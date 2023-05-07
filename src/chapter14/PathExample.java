package chapter14;

import java.nio.file.Path;

public class PathExample {
    public static void main(String[] args) {
        Path p = Path.of("d:\\docs\\note.txt");
        System.out.println(p);
        System.out.println(p.getRoot()); 
        System.out.println(p.getParent());
        System.out.println(p.getFileName());
    }
}
