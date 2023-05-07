package chapter03;

import java.util.Random;

public class RectangleTest2 {
    public static void main(String[] args) {
        Rectangle r1 = null;

        Random r = new Random();
        int n = r.nextInt(3) + 1;

        switch(n) {
            case 1:
                r1 = new Rectangle(10, 20, 30, 40, "green");
                break;
            case 2:
                r1 = new Rectangle(30, 15, "blue");
                break;
            case 3:
                r1 = new Rectangle(5, 40);
                break;
        }
        
        System.out.println("面積: " + r1.area());        
        System.out.println("対角線: " + r1.diagonal());        
        System.out.println("外　周: " + r1.perimeter());
    }
}
