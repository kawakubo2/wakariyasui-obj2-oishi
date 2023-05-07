package chapter15.exercise;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Path;

public class Pass6 {
    public static void main(String[] args) {
        Path path = Path.of("books.dat");
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path.toFile())));) {
            System.out.printf("%15d\t%s\t%s%n", in.readLong(), in.readUTF(), in.readObject());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
