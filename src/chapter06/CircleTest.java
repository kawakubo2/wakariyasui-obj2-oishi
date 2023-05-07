package chapter06;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle("blue", 5.5);
        System.out.println("色　: " + c.getColor());
        System.out.println("半径: " + c.getRadius());
        System.out.printf("面積: %6.2f", c.area());
    }
}
