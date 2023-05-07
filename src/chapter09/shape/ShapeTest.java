package chapter09.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] player1 = {
            new Rectangle(10, 20),
            new Circle(5),
            new Triangle(25, 8),
            new Rectangle(10, 10),
            new Diamond(6, 14),
        };

        Shape[] player2 = {
            new Circle(10),
            new Triangle(30,  5),
            new Rectangle(5, 20),
            new Diamond(3, 4),
            new Trapezoid(2, 8, 5),
        };
        double total1 = calcTotalArea(player1);
        double total2 = calcTotalArea(player2);
        System.out.printf("プレイヤー1: %.15f  プレイヤー2: %.15f%n", total1, total2);
        judge(total1 , total2);
    }
    public static double calcTotalArea(Shape[] shapes) {
        double total = 0;
        for (Shape s: shapes) {
            total += s.area();
        }
        return total;
    }
    public static void judge(double total1, double total2) {
        if (total1 > total2) {
            System.out.println("プレイヤー1の勝ち");
        } else if (total1 < total2) {
            System.out.println("プレイヤー2の勝ち");
        } else {
            System.out.println("引き分け");
        }
    }
}
