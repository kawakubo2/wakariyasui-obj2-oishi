package chapter06.sample;

public class X {
    private String name;
    public X(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void friend(X x) {
        System.out.println(this.name + "の友達は" + x.name);
    }
}
