package chapter05;

public class CSVTest {
    public static void main(String[] args) {
        String str = "100,田中宏,20,68.0,178.5";

        Csv csv = new Csv(str);

        String name = csv.get(1);
        double weight = csv.getDouble(3);
        double height = csv.getDouble(4);

        double bmi = weight / Math.pow(height / 100, 2);
        System.out.printf("%5s%6.1f%n", name, bmi);
    }
}
