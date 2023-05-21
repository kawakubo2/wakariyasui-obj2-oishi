package chapter18;

public class Pass1 {
    public static void main(String[] args) {
        String[] flowers = {"Tulip", "SunFlower", "MorningGlory", "Rose"};
        var box1 = new Box<String>(flowers);
        System.out.println(box1.get(2));
    }
}
