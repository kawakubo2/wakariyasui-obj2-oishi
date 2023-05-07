package chapter08;

import java.util.Random;

public class FruitTest {
    public static void main(String[] args) {
        Fruit fruit = new Banana();
        fruit.printFruit();
        Banana banana = (Banana)fruit;
        banana.printBanan();
        /*
         * 
         */
        Random r = new Random();
        if (r.nextBoolean()) {
            fruit = new Banana();
        } else {
            fruit = new Apple();
        }
        /*
         * 
         */
        if (fruit instanceof Banana b) {
            b.printBanan();
        } else if (fruit instanceof Apple a) {
            a.printApple();
        }
    }
}
