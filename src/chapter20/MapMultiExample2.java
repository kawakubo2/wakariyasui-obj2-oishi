package chapter20;

public class MapMultiExample2 {
    public static void main(String[] args) {
        var list = Department.getList();
        list.stream()
            .<String>mapMulti((dep, buffer) -> {
                dep.employees().stream().forEach(name -> buffer.accept(name));
            })
            .forEach(name -> System.out.print(name + " "));

        System.out.println();
    }
}
