package chapter21;

import java.util.Optional;

public class FindExample {
    public static void main(String[] args) {
        var list = PC.getList();
        Optional<String> anyPc = list.stream()
            .filter(pc -> "Panan".equals(pc.maker()))
            .map(PC::maker)
            .findAny();
        System.out.println(anyPc.orElseGet(() -> "存在しない"));
    }
    
}
