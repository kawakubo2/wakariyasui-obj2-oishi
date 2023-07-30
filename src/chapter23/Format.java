package chapter23;

import java.util.Random;

public class Format {
    public static void main(String[] args) {
        String name = "山田太郎";
        int age = 38;
        double height = 170;
        double weight = 70;
        String s1 = String.format("%sさんの年齢は%d歳です%n", name, age);
        String s2 = String.format("%sさんのBMI値は%.1fです%n", name, weight / Math.pow(height / 100, 2));
        Random r = new Random();
        if (r.nextBoolean()) {
            System.out.println(s1);
        } else {
            System.out.println(s2);
        }

    }
    
}
