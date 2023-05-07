package chapter05;

public record Population(String prefecture, int population, double rate) {
    public Population {
        if (prefecture == null) {
            throw new RuntimeException("都道府県名がnull");
        }
    }
    public Population(String prefecture, int population) {
        this(prefecture, population, 0);
    }
    public boolean isPlus() {
        return rate > 0;
    }
}
