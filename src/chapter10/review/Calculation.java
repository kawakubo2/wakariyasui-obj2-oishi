package chapter10.review;

public abstract class Calculation {
    private double[] dt;
    protected Calculation(double[] dt) {
        this.dt = dt;
    }
    public abstract double calculate();
    public double[] getDt() {
        return dt;
    }
}
