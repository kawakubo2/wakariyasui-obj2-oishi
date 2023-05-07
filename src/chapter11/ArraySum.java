package chapter11;

public class ArraySum {
    private int[] nums;
    public ArraySum(int[] nums) {
        this.nums = nums;
    }
    public int sum() {
        int total = 0;
        for (int n: nums) {
            total += n;
        }
        return total;
    }
    public int higherSum(Selectable s) {
        int total = 0;
        for (int n: nums) {
            if (s.test(n)) {
                total += n;
            }
        }
        return total;
    }
    public int sumPositive() {
        int total = 0;
        for (int n: nums) {
            if (n > 0) {
                total += n;
            }
        }
        return total;
    }
    public int sumPositiveOdd() {
        int total = 0;
        for (int n: nums) {
            if (n > 0 && n % 2 != 0) {
                total += n;
            }
        }
        return total;
    }
    public int sumBetween5and10() {
        int total = 0;
        for (int n: nums) {
            if (n >= 5 && n <= 10) {
                total += n;
            }
        }
        return total;
    }
}
