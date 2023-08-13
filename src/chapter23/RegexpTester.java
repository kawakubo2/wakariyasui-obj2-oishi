package chapter23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexpTester {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));) {
            TOP_LOOP:
            while (true) {
                System.out.print("正規表現(XXXXXで終了): ");
                String pattern = in.readLine();
                if ("XXXXX".equals(pattern)) {
                    break;
                }
                Pattern p = Pattern.compile(pattern);
                while (true) {
                    System.out.println("対象文字列(XXXXXで終了|YYYYYで新しい正規表現)");
                    String target = in.readLine();
                    if ("XXXXX".equals(target)) break TOP_LOOP;
                    if ("YYYYY".equals(target)) break;
                    Matcher m = p.matcher(target);
                    if (m.find()) {
                        System.out.println("○ " + m.group(0));
                    } else {
                        System.out.println("×");
                    } 
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    } 
}
