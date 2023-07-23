package chapter23;

import java.util.Scanner;

public class CodePointAtTest {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("文字列: ");
        String s = stdIn.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + "の文字コードは" + s.codePointAt(i));
        }

        stdIn.close();
    }
}
