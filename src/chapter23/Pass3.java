package chapter23;


public class Pass3 {
    public static void main(String[] args) {
        System.out.println("===< A >===");
        String[] okA = {"a00143", "B?", "C ", "D123456789", "XYZ  123"};
        String[] ngA = {"A", "a", "1ABC", "A01234567890", "1"};

        String patternA = "^[a-zA-Z].{1,9}$";
        RegexpTester.test(patternA, okA, true);
        RegexpTester.test(patternA, ngA, false);

        System.out.println("\n===< B >===");
        String[] okB = {"abc-12345", "xxx-34", "num-33", "xyz-1", "mmm-9999999999999"};
        String[] ngB = {"abcd-123", "abc-123B", "abc#123", "abc-123.4", "ABC-1234"};
        String patternB = "^[a-z]{3}-\\d+$";
        RegexpTester.test(patternB, okB, true);
        RegexpTester.test(patternB, ngB, false);

        System.out.println("\n===< C >===");
        String[] okC = {"Tulip", "Rose", "Apricot"};
        String[] ngC = {"Sun Flower", "Tande Lion", "Marry Gold", "Morning Glory"};
        String patternC = "^(?=.*[a-zA-Z])(?!.*[ ]).+$";
        RegexpTester.test(patternC, okC, true);
        RegexpTester.test(patternC, ngC, false);

        System.out.println("\n===< D >===");
        String[] okD = {"￥1,234", "￥12,345", "￥123,456"};
        String[] ngD = {"1,234", "￥123", "￥1,234,567", "￥a23,456", "$123,456"};
        String patternD = "^￥\\d{1,3},\\d{3}$";
        RegexpTester.test(patternD, okD, true);
        RegexpTester.test(patternD, ngD, false);
    }

}
