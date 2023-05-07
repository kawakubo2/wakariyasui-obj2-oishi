package chapter11.exercise;

public class BookShop implements Readable {
    private String name;
    public BookShop(String name) {
        this.name = name;
    }
    @Override
    public void read() {
        System.out.println("Readable");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
