package chapter03.q3_3_2;

public class Computer {
    private String name;
    private int cores;
    public Computer(String name, int cores) {
        this.name = name;
        this.cores = cores;
    }
    public Computer(String name) {
        this(name, 32);
    }
    public Computer() {
        this("M200");
    }
    public String getName() {
        return name;
    }
    public int getCores() {
        return cores;
    }

}
