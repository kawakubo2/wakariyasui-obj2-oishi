package chapter17;

import java.util.HashMap;

public class MapOperation {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();        
        map.put(115, "田中");
        map.put(120, "木村");
        map.put(108, "佐藤");
        map.put(115, "佐々木");

        System.out.println(map.get(115));
        System.out.println(map.get(200));;
        System.out.println(map.getOrDefault(200, "***"));;

    }
}
