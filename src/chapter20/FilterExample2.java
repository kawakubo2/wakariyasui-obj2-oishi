package chapter20;

import java.util.List;

public class FilterExample2 {
    public static void main(String[] args) {
        var list = PC.getList();
        List<PC> makerPanan = list.stream()
                                .filter(pc -> "Panan".equals(pc.maker()))
                                .toList();
        makerPanan.forEach(System.out::println);
    }
}
