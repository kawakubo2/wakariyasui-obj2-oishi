package chapter23;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(500);
        sb.append(2025)
          .append("年")
          .append(7)
          .append("月");
        System.out.println(sb.toString());

        String result = "";
        result += 2025;
        result += "年";
        result += 7;
        result += "月";
        System.out.println(result);

    }
}
