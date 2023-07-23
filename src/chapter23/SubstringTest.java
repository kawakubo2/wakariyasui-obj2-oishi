package chapter23;

public class SubstringTest {
    public static void main(String[] args) {
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int end = 0;
        for (int start = 0; start < alpha.length(); start += 5) {
            end = start + 5;
            if (end > alpha.length()) {
                end = alpha.length();
            }
            System.out.println(alpha.substring(start, end));
        }
    }

}
