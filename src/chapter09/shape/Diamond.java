package chapter09.shape;

public class Diamond implements Shape {
    private double diagonal1; // 対角線1
    private double diagonal2; // 対角線2
    public Diamond(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    public double area() {
        return diagonal1 * diagonal2 / 2;
    }
    @Override
    public String toString() {
        return "Diamond [diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 + "]";
    }
    
}
