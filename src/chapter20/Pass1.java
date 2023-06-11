package chapter20;

public class Pass1 {
    public static void main(String[] args) {
        var list = Book.getList();
        list.stream()
            .filter(b -> !b.stock())
            .forEach(System.out::println);
    }
    
}
