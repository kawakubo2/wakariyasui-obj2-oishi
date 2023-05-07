package chapter15;

import java.io.PrintWriter;

public class PrintWriterExample {
    public static void main(String[] args) {
        // try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(path, Charset.forName("UTF-8")));) {
        try (PrintWriter out = new PrintWriter("data.txt", "UTF-8");) {
            out.print(100);
            out.print("\t");
            out.print("佐々木義男");
            out.print("\t");
            out.println(60.5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
