package chapter23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexpTester {
    public static void test(String pattern, String[] targets, boolean isOk) {
        System.out.print("---< ");
        System.out.print(isOk ? "正常系テスト" : "異常系テスト");
        System.out.println(" >---");
        Pattern p = Pattern.compile(pattern);
        int counter = 0;
        for (String target: targets) {
            System.out.print(target + "\t");
            Matcher m = p.matcher(target);
            if (m.find()) {
                System.out.println("○");
                counter++;
            } else {
                System.out.println("×");
            } 
        }
        System.out.print("判定: ");
        if (isOk) {
            System.out.println(counter == targets.length ? "合格" : "不合格");
        } else {
            System.out.println(counter == 0 ? "合格" : "不合格");
        }
        System.out.println(counter +  " / " + targets.length);
    }
    
}
