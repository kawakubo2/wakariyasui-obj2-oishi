package chapter15.q15_4_1;

import java.io.IOException;
import java.io.PrintWriter;

public class Ex01 {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("order.txt", "UTF-8");) {
            out.print("ICBK61");
            out.print("\t");
            out.print("2020-07-11");
            out.print("\t");
            out.println(5);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
