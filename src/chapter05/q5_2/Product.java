package chapter05.q5_2;

public record Product(String code, String name, int price, boolean shortage) {
    public Product(String code, String name, int price) {
        this(code, name, price, false);
    }
}
