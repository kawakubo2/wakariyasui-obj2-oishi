package chapter10.review;

public class CalculationTest {
    public static void main(String[] args) {
        double[] data = {1.1, 2.2, 3.3, 4.4, 5.5};
        Sum sum = new Sum(data);
        System.out.println("合計" + sum.calculate());
        System.out.println("平均: " + sum.average());
    }
}
