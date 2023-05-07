package chapter04.q4_2;

import java.time.LocalDate;

public class Author {
    private String name;
    private LocalDate birthdate;
    private String address;
    public Author(String name, LocalDate birthdate, String address) {
        this.name = name;
        this.birthdate = birthdate;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthdate() {
        return birthdate;
    }
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Author [name=" + name + ", birthdate=" + birthdate + ", address=" + address + "]";
    }
}
