package chapter23;

public class CharExample2 {
    public static void main(String[] args) {
        String s = "abc1315dzxxx89173013820747xxxio3889";
        long count = s.chars()
                    .filter(c -> c >= '0' && c <= '9')
                    .count();
        System.out.printf("%sの中に数字文字は%d個あります。%n", s, count);
    }
}
