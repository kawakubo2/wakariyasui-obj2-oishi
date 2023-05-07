package chapter01.exercise;

import java.time.LocalDate;

public class Bihin {
    private String name;
    private LocalDate date;
    private int price;
    private int quantity;
    public Bihin(String name, LocalDate date, int price, int quantity) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // p49の練習問題 問4の対応で追加
    public boolean isAfterBihin(LocalDate date) {
        return this.date.isAfter(date);
    }
    @Override
    public String toString() {
        return "Bihin [name=" + name + ", date=" + date + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
