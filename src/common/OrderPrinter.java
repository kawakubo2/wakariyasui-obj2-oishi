package common;

public class OrderPrinter {
    public static void print(Order order) {
        System.out.println("型　番=" + order.getCode());
        System.out.println("受注日=" + order.getDate());
        System.out.println("価　格=" + order.getPrice());
        System.out.println("個　数=" + order.getQuantity());
        System.out.println("納品済=" + (order.isDelivery() ? "納品済": "未納"));
    }
}
