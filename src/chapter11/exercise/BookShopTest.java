package chapter11.exercise;

public class BookShopTest {
    public static void main(String[] args) {
        BookShop bs = new BookShop("積文館");
        bs.read();
        System.out.println(bs.getName());
    }
}
