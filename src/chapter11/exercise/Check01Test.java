package chapter11.exercise;

public class Check01Test {
    public static void main(String[] args) {
        int[] numbers = {110, 30, 50, 99, 58, 21};
        System.out.println("50未満100超の数をエラーとする");
        findError(numbers, new Check01());
        System.out.println("偶数または100以上の数をエラーとする");
        findError(numbers, new Check02());
    }
    public static void findError(int[] numbers, CheckNumber t) {
        for (int n: numbers) {
            if (t.test(n)) {
                System.err.println(n);
            }
        }
    }
}
