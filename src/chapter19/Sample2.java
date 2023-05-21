package chapter19;

import java.util.ArrayList;

record Student(int id, String name) {}

public class Sample2 {
    public static void main(String[] args) {
        var list = new ArrayList<Student>();
        list.add(new Student(101, "田中宏"));        
        list.add(new Student(102, "鈴木一郎"));        
        list.add(new Student(103, "木村太郎"));
        
        list.forEach(System.out::println);
    }
}
