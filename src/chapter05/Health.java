package chapter05;

public class Health {
    public static final double STD_BMI = 22;
    private double weight; // 体重(kg)
    private double height; // 身長(cm)
    public Health (double weight, double height) {
        setWeight(weight);
        setHeight(height);
    }
    public double getWeight() {
        return weight;
    }
    private void setWeight(double weight) throws IllegalArgumentException {
        if (weight <= 0) {
            throw new IllegalArgumentException("身長が0以下");
        }
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    private void setHeight(double height) throws IllegalArgumentException {
        if (height <= 0) {
            throw new IllegalArgumentException("身長が0以下");
        }
        this.height = height;
    }
    public double getStdWeight() {
        return STD_BMI * Math.pow(this.height / 100, 2);
    }
    public double getBmi() {
        return this.weight / Math.pow(this.height / 100, 2);
    }
    @Override
    public String toString() {
        return "Health [weight=" + weight + ", height=" + height + "]";
    }
    
}
