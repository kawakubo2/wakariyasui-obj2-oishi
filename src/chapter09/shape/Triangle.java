package chapter09.shape;

public class Triangle implements Shape {
    private double base; // 底辺
    private double height; // 高さ
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return base * height / 2;
    }
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + "]";
    }
}
