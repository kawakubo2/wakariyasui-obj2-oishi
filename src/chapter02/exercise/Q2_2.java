package chapter02.exercise;

import java.time.LocalDate;

import common.Order;
import common.OrderPrinter;


public class Q2_2 {
    public static void main(String[] args) {
        Order order = new Order("ICBK61", LocalDate.of(2025, 7, 11), 2100, 5, true);
        System.out.println("=== 変更前 ===");
        OrderPrinter.print(order);
        order.setDate(LocalDate.of(2025, 8, 30));
        order.setQuantity(12);
        System.out.println("=== 変更後 ===");
        OrderPrinter.print(order);
    }
}
