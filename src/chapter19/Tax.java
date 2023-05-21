package chapter19;

interface TaxRate {
    double rate(int gaku);
}
public class Tax {
    public static void main(String[] args) {
        int shotoku = 200;
        double zeigaku = tax(shotoku, a -> a < 100 ? 0.15: 0.35);
        System.out.println("税額=" + zeigaku);
    }
    public static double tax(int shotoku, TaxRate obj) {
        return obj.rate(shotoku) * shotoku;
    }
}
