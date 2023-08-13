package chapter23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyReplace {
    public static void main(String[] args) {
        String[] members = {
            "Taro Yamada,23,78,170,Tokyo",
            "Hanako Yokoyama,32,57,155,Osaka",
            "Ichiro Tanaka,55,80,178,Fukuoka"
        };
        String p = "^([a-zA-Z]+ [a-zA-Z]+),(\\d{1,3}),(\\d{1,3}),(\\d{1,3}),([a-zA-Z]+)$";
        Pattern pattern = Pattern.compile(p);
        for (String member: members) {
            Matcher m = pattern.matcher(member);
            if (m.find()) {
                System.out.println(m.group(5) + "," + m.group(1) + "," + m.group(2));
            }
        }
    }
}
