package chapter20;

import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        var list = Department.getList();
        List<String> employees = 
            list.stream()
                .map(Department::employees)
                .flatMap(List::stream)
                .toList();
        System.out.println(employees != null ? String.join(",", employees) : "");
    }
}
