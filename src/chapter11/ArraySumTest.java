package chapter11;

public class ArraySumTest {
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum(
            new int[] {4, 7, 8, 9, -2, 3, 
                1, 6, 10, -5, 5, 2}
        );
        System.out.printf("合計=%d%n", arraySum.sum());
        System.out.printf("正数の合計=%d%n", arraySum.sumPositive());
        System.out.printf("正の奇数の合計=%d%n", arraySum.sumPositiveOdd());
        System.out.printf("正の奇数の合計=%d%n", arraySum.higherSum(new PositiveOddSelector()));
        System.out.printf("5～10の合計=%d%n", arraySum.sumBetween5and10());
        System.out.printf("5～10合計=%d%n", arraySum.higherSum(n -> n >= 5 && n <= 10));
        System.out.printf("6以下の偶数の合計=%d%n", arraySum.higherSum(n -> n <= 6 && n % 2 == 0));
    }
}
