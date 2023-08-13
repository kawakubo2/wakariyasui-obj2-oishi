package chapter21;

public class SplitExample9 {
    public static void main(String[] args) {
        String[] dates = {
            "2023-07-30",
            "2023/07/30",
            "2023.07.30"
        };
        // Pattern p = Pattern.compile("[/\\.\\-]");
        for (String d: dates) {
            String[] ymd = d.split("[/\\.\\-]");
            System.out.printf("%s年%s月%s日%n", ymd[0], ymd[1], ymd[2]);
        }

    }
}
