package chapter09.shape;

public class Circle implements Shape {
    private double radius; // 半径
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.pow(radius, 2) * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
