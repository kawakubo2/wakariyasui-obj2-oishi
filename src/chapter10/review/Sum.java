package chapter10.review;

public class Sum extends Calculation {
    private Double total = null;
    public Sum(double[] dt) {
        super(dt);
    }
    public double calculate() {
        double sum = 0;
        for (double d: getDt()) {
            sum += d;
        }
        this.total =  sum;
        return sum;
    }
    public double average() {
        double sum;
        if (total == null) {
            sum = calculate();
        } else {
            sum = total;
        }
        return sum / getDt().length;
    }
}
