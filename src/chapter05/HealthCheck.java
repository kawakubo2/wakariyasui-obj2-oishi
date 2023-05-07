package chapter05;

import lib.Input;

public class HealthCheck {
    public static void main(String[] args) {
        Health health = new Health(Input.getDouble("体重(kg)"), Input.getDouble("身長(cm)"));
        System.out.printf("標準体重: %6.2fkg%n", health.getStdWeight());
        System.out.printf("ＢＭＩ値: %6.2f%n", health.getBmi());
    }
}
