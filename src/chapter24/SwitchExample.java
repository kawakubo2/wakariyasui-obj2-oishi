package chapter24;

public class SwitchExample {
    public static void main(String[] args) {
        SmartPhone p = new SmartPhone("100", Color.WHITE);
        switch (p.color()) {
            case WHITE -> System.out.println("白です。");
            case BLACK-> System.out.println("黒です。");
            case GOLD-> System.out.println("金色です。");
        }        
    }
}
