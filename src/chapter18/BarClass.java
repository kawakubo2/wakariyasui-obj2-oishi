package chapter18;

public class BarClass {
    public static void main(String[] args) {
        Bar<String, Integer> bar = new Bar<>() {
            @Override
            public Integer get(String s) {
                return s.length();
            }
        };
        System.out.println(bar.get("入門Java"));

        Bar<Integer, Double> bar2 = new Bar<>() {
            @Override
            public Double get(Integer n) {
                return Math.sqrt(n);
            }
        };
        System.out.println(bar2.get(5));
    }
}
