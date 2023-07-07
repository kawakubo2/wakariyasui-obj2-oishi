package chapter21;

import java.util.Optional;

public class IfPresentOrElseExample {
    public static void main(String[] args) {
        var list = PC.getList();
        Optional<PC> anyPc =
            list.stream()
                /*  .filter(pc -> "Panann".equals(pc.maker())) */
                .filter(pc -> "Panan".equals(pc.maker()))
                .findAny();

        anyPc.ifPresentOrElse(
            pc -> System.out.println(pc.name()), 
            () -> System.out.println("該当がありません。")
        );
        
    }
}
