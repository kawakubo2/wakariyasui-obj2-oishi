package chapter18.filter;

public class SumExample {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 8, 2, 4, 6, 7, 3, 1, 10, -1, -2};
        System.out.println("偶数の合計: " + sumIfEven(numbers));
        System.out.println("正の奇数の合計: " + sumIfPositiveOdd(numbers));
        System.out.println("6～10の合計: " + sumBetween6and10(numbers));

        System.out.println("---< 匿名クラスを使った例 >---");
        System.out.println("偶数の合計: " + sum(numbers,
            new Filter() {
                @Override
                public boolean test(int n) {
                    return n % 2 == 0;
                }
            }
        ));
        System.out.println("正の奇数の合計: " + sum(numbers, 
            new Filter() {
                @Override
                public boolean test(int n) {
                    return n > 0 && n % 2 != 0;
                }
            }
        ));
        System.out.println("6～10の合計: " + sum(numbers, 
            new Filter() {
                @Override
                public boolean test(int n) {
                    return n >= 6 && n <= 10;
                }
            }
        ));

        System.out.println("---< ラムダ式を使った例 >---");
        System.out.println("偶数の合計: " + sum(numbers, n -> n % 2 == 0));
        System.out.println("正の奇数の合計: " + sum(numbers, n -> n > 0 && n % 2 != 0));
        System.out.println("6～10の合計: " + sum(numbers, n -> n >= 6 && n <= 10));
    }
    public static int sum(int[] nums, Filter filter) {
        int sum = 0;
        for (int n: nums) {
            if (filter.test(n)) {
                sum += n;
            }
        }
        return sum;
    }
    public static int sumIfEven(int[] nums) {
        int sum = 0;
        for (int n: nums) {
            if (n % 2 == 0) {
                sum += n;
            }
        }
        return sum;
    }
    public static int sumIfPositiveOdd(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n > 0 && n % 2 != 0) {
                sum += n;
            }
        }
        return sum;
    }
    public static int sumBetween6and10(int[] nums) {
        int sum = 0;
        for (int n: nums) {
            if (n >= 6 && n <= 10) {
                sum += n;
            }
        }
        return sum;
    }
}
