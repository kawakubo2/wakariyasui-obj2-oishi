package chapter21;

public class pass4 {
    public static void main(String[] args) {
        var sales = Sales.getList();
        long count = 
            sales.stream()
                 .filter(s -> s.pc().price() * s.quantity() >= 100_000)
                 .count();
        System.out.println("100,000以上の取引件数: " + count);
    }
}
