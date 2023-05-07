package chapter18.sample2;

import java.time.LocalDate;

public class Employee {
    private String number; // 社員番号
    private String name; // 氏名
    private LocalDate date; // 入社年月日
    private String email; // Email
    public Employee(String number, String name, LocalDate date, String email) {
        this.number = number;
        this.name = name;
        this.date = date;
        this.email = email;
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
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Employee [number=" + number + ", name=" + name + ", date=" + date + ", email=" + email + "]";
    }
}
