package chapter08;

public class SwitchExample {
    public static void main(String[] args) {
        Object obj = new B();
        /*
        String result = switch(obj) {
            case C c -> c.name();
            case B b -> b.name();
            case A a -> a.name();
            case null -> "nullです";
            default   -> "その他のクラス";
        };
        */
        String result;
        if (obj instanceof C c) {
            result = c.name();
        } else if (obj instanceof B b) {
            result = b.name();
        } else if (obj instanceof A a) {
            result = a.name();
        } else {
            result = "その他のクラス";
        }
        System.out.println(result);
    }
}
