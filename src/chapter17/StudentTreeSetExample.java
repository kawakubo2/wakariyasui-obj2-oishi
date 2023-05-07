package chapter17;

import java.util.Comparator;
import java.util.TreeSet;

record Student(int id, String name) implements Comparable<Student> {
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name().compareTo(s2.name());
    }
}

public class StudentTreeSetExample {
    public static void main(String[] args) {
        // var students = new TreeSet<Student>(new NameComparator());
        var students = new TreeSet<Student>((s1, s2) -> s1.name().compareTo(s2.name()));
        students.add(new Student(130, "タナカヒロシ"));
        students.add(new Student(100, "イノウエコウゾウ"));
        students.add(new Student(120, "サトウジロウ"));

        students.forEach(System.out::println);
    }
}
