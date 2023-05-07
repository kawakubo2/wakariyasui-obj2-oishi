package chapter18;

import java.util.List;

public class FilterTest {
    static class EvenSum implements Filter {
        public Boolean test(Integer n) {
            return n % 2 == 0;
        }
    }
    static class PositiveSum implements Filter {
        public Boolean test(Integer n) {
            return n > 0;
        }
    }
    static class PositiveEvenSum implements Filter {
        public Boolean test(Integer n) {
            return n > 0 && n % 2 == 0;
        }
    }
    public static void main(String[] args) {
        var numbers = List.of(8, 3, 2, 5, 6, -8, -5, 9, 1, 4);
        System.out.println(getEvenSum(numbers));
        System.out.println(getPositiveSum(numbers));
        System.out.println(getPositiveEvenSum(numbers));
        System.out.println("---< 高階関数 >---");
        System.out.println(getSum(numbers, new FilterTest.EvenSum()));
        System.out.println(getSum(numbers, new FilterTest.PositiveSum()));
        System.out.println(getSum(numbers, new FilterTest.PositiveEvenSum()));
        System.out.println(getSum(numbers, n -> n % 2 != 0));
    }
    public static int getEvenSum(List<Integer> nums) {
        int total = 0;
        for (int n: nums) {
            if (n % 2 == 0) {
                total += n;
            }
        }
        return total;
    }
    public static int getPositiveSum(List<Integer> nums) {
        int total = 0;
        for (int n: nums) {
            if (n > 0) {
                total += n;
            }
        }
        return total;
    }
    public static int getPositiveEvenSum(List<Integer> nums) {
        int total = 0;
        for (int n: nums) {
            if (n > 0 && n % 2 == 0) {
                total += n;
            }
        }
        return total;
    }
    public static int getSum(List<Integer> nums, Filter filter) {
        int total = 0;
        for (int n: nums) {
            if (filter.test(n)) {
                total += n;
            }
        }
        return total;
    }
    
}
