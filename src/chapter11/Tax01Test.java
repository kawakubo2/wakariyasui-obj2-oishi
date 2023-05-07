package chapter11;

public class Tax01Test {
    public static void main(String[] args) {
        int shotoku = 200;
        double zeigaku = tax(shotoku, new Tax01());
        System.out.println("税額=" + zeigaku);
    }
    public static double tax(int shotoku, TaxRate obj) {
        double r = obj.rate(shotoku);
        return shotoku * r;
    }
}
