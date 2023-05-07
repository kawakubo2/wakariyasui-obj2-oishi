package chapter12;

import lib.Input;

public class ThrowsTest {
    public static void main(String[] args) {
        double b = Input.getDouble();
        double h = Input.getDouble();
        double area = calcTriangleArea(b, h);
        System.out.println("三角形の面積" + area);
    }
    public static double calcTriangleArea(double base, double height) throws IllegalArgumentException {
        if (base <= 0) {
            throw new IllegalArgumentException("底辺が0以下");
        }
        if (height <= 0) {
            throw new IllegalArgumentException("高さが0以下");
        }
        return base * height / 2;
    }
}
