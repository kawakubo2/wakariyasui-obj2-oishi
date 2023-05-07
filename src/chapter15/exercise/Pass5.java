package chapter15.exercise;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.time.LocalDate;

public class Pass5 {
    public static void main(String[] args) {
        Path path = Path.of("books.dat");
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path.toFile())));) {
            out.writeLong(1234567890123L);
            out.writeUTF("プラグラマのための健康法");
            out.writeObject(LocalDate.of(2020, 1, 15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
