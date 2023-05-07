package chapter16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record Employee(int number, String name, double weight, double height) {}
public class EmplolyeeSort {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1010, "ヤマダタロウ", 68, 170),
            new Employee(1002, "ヨコヤマハナコ", 68, 160),
            new Employee(1001, "タナカイチロウ", 68, 180),
            new Employee(1023, "ヤマモトクミコ", 68, 172)
        };
        var list = Arrays.asList(employees);
        System.out.println("--- BMI順 ---");
        list.sort((e1, e2) -> {
            if (bmi(e1.weight(), e1.height()) < bmi(e2.weight(), e2.height())) {
                return -1;
            } else if (bmi(e1.weight(), e1.height()) > bmi(e2.weight(), e2.height())) {
                return 1;
            } else {
                return 0;
            }
        });
        printList(list);

        System.out.println("--- 身長順 ---");
        list.sort(Comparator.comparing(Employee::height));
        printList(list);
    }

    private static double bmi(double weight, double height) {
        return weight / (Math.pow(height / 100, 2));
    }

    private static void printList(List<Employee> list) {
        for (Employee e: list) {
            System.out.println(e);
        }
    }
}
