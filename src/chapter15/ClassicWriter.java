package chapter15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

import lib.Input;

public class ClassicWriter {
    public static void main(String[] args) {
        try (PrintWriter out = 
        new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream("PathExample.java"),Charset.forName("UTF-8"))));) {
            while (true) {
                String line = Input.getString("終了時はxxxx");
                if ("xxxx".equals(line)) break;
                out.println(line);
            }    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
