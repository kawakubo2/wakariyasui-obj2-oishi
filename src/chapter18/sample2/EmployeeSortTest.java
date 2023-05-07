package chapter18.sample2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortTest {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee("S010", "ヤマダタロウ", LocalDate.of(1988, 4, 1), "taro@yamada.com"),
            new Employee("S025", "ヨコヤマハナコ", LocalDate.of(1998, 4, 1), "hanako@yokoyama.com"),
            new Employee("S001", "タナカイチロウ", LocalDate.of(1968, 4, 1), "ichiro@tanaka.com"),
            new Employee("S008", "スズキジロウ", LocalDate.of(1980, 4, 1), "jiro@suzuki.com")
        );
        System.out.println("---< ソート前 >---");
        list.forEach(System.out::println);

        System.out.println("---< 社員番号順にソート >---");
        list.sort(Comparator.comparing(Employee::getNumber));
        list.forEach(System.out::println);

        System.out.println("---< 名前順にソート >---");
        list.sort(Comparator.comparing(Employee::getName));
        list.forEach(System.out::println);

        System.out.println("---< 入社年月日順にソート >---");
        list.sort(Comparator.comparing(Employee::getDate));
        list.forEach(System.out::println);
    }
}
