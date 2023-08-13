package chapter21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {
    public static void main(String[] args) {
        String pattern = "^(\\d{2,4})-(\\d{2,4})-(\\d{4})$";
        String[] targets = {"092-292-9999", "03-3721-0564", "045-281-0000"};
        Pattern p = Pattern.compile(pattern);
        Matcher m = null;
        for (String t: targets) {
            m = p.matcher(t);
            if (m.find()) {
                System.out.println("--------------------");
                System.out.println("市外局番　: " + m.group(1));
                System.out.println("市内局番　: " + m.group(2));
                System.out.println("加入者番号: " + m.group(3));
            }
        }
    }
}
