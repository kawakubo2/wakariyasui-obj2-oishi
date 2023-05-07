package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;

public class Product {
    private String number;
    private String name;
    private int price;
    private LocalDate date;
    private boolean stock;
    public Product(String number, String name, int price, LocalDate date, boolean stock) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.date = date;
        this.stock = stock;
    }
    public Product(String number, String name, int price) {
        this(number, name, price, LocalDate.now(), true);
    }
    public Product(String fileName) throws IOException{
        try (BufferedReader in = Files.newBufferedReader(Path.of(fileName));) {
            String str = in.readLine();
            String[] productItems = str.split(",");
            this.number = productItems[0].trim();
            this.name = productItems[1].trim();
            this.price = Integer.parseInt(productItems[2].trim());
            this.date = LocalDate.parse(productItems[3].trim());
            this.stock = "1".equals(productItems[4].trim()) ? true: false;
        } catch(IOException e) {
            // ログファイルへの出力
            throw e;
        }
    }
    public Product() {
        this("", "", 0, LocalDate.of(2020, 1, 10), true);
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public boolean isStock() {
        return stock;
    }
    public void setStock(boolean stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Product [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date + ", stock="
                + stock + "]";
    }
}
