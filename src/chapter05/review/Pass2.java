package chapter05.review;

record Seiseki(String name, double[] score) {
    public double average() {
        double total = 0.0;
        for (double d: score()) {
            total += d;
        }
        return total / score().length;
    }
}
public class Pass2 {
    public static void main(String[] args) {
        Seiseki[] data = {
            new Seiseki("田中真一", new double[] { 80.0, 65.0, 85.0 }),
            new Seiseki("前田はな", new double[] { 90.0, 80.0, 95.0 }),
            new Seiseki("中村恵美", new double[] { 70.0, 90.0, 75.0 }),
            new Seiseki("木村一郎", new double[] { 60.0, 70.0, 65.0 }),
            new Seiseki("鈴木二郎", new double[] { 85.0, 65.0, 70.0 }),
        };
        for (Seiseki s: data) {
            String name = s.name();
            double[] score = s.score();
            System.out.printf("%s%6.1f%6.1f%6.1f%6.1f%n", 
                name, score[0], score[1], score[2], s.average());
        }
    }
}
