package chapter09.shape;

public class Trapezoid implements Shape {
    private double upperbase;
    private double lowerbase;
    private double height;
    public Trapezoid(double upperbase, double lowerbase, double height) {
        this.upperbase = upperbase;
        this.lowerbase = lowerbase;
        this.height = height;
    }
    public double area() {
        return (upperbase + lowerbase) * height / 2;
    }
    
}
