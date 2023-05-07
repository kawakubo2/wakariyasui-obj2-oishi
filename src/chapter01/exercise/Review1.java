package chapter01.exercise;

public class Review1 {
    public static void main(String[] args) {
        Seiseki[] seisekis = {
            new Seiseki("s2020001", "田中宏", new int[] {88, 75, 66}),
            new Seiseki("s2020002", "鈴木一郎", new int[] {78, 70, 91}),
            new Seiseki("s2020003", "佐藤栄作", new int[] {70, 66, 72}, true),
        };
        for (Seiseki s: seisekis) {
            System.out.println(s);
        }
    }
}
