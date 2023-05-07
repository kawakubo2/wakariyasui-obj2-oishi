package chapter15;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.time.LocalDate;


public class OStreamExample {
    public static void main(String[] args) {
        Path path = Path.of("ostream.dat");
        try (
            ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path.toFile())));
        ) {
            out.writeInt(12345);
            out.writeUTF("文字列abc");
            out.writeObject(LocalDate.now()); 

            try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path.toFile())));) {
            int number = in.readInt();
            String str = in.readUTF();
            LocalDate date = (LocalDate)in.readObject();
            System.out.println(number + "\t" + str + "\t" + date);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
