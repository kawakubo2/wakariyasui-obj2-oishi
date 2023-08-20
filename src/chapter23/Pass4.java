package chapter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pass4 {
    public static void main(String[] args) {
        String pattern = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*[^a-zA-Z0-9]).{6,10}$";
        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            while (true) {
                System.out.print("パスワード(終了時はxxxxx): ");
                String s = in.readLine();
                if ("xxxxx".equals(s)) break;
                if (s.matches(pattern)) {
                    System.out.println("OK");
                } else {
                    System.out.println("パスワードの要件を満たしていません。");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}