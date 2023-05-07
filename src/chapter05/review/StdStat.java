package chapter05.review;

import chapter05.Csv;

public class StdStat {
    private double[] data;
    public StdStat(double[] data) {
        this.data = data;
    }
    public StdStat(String csvString) {
        Csv csv = new Csv(csvString);
        this.data = new double[csv.size()];
        String[] a = new String[csv.size()];
        for (int i = 0; i < a.length; i++) {
            data[i] = csv.getDouble(i);
        }
    }
    public double total() {
        double total = 0;
        for (double d: data) {
            total += d;
        }
        return total;
    }
    public double avg() {
        return total() / data.length;
    }
    public double max() {
        double max = data[0];
        for (double d: data) {
            if (d > max) max = d;
        }
        return max;
    }
    public int count() {
        return data.length;
    }
    
}
