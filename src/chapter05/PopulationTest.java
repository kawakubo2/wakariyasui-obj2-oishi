package chapter05;

public class PopulationTest {
    public static void main(String[] args) {
        try {
            Population[] data = {
                new Population("北海道", 5250, -6.8),
                new Population("東京都", 13921, 7.1),
                new Population("大阪府", 8809, -0.4),
                new Population("福岡県", 5250, -0.7),
                new Population("沖縄県", 1453, 3.9),
            };
            for (Population p: data) {
                if (!p.isPlus()) {
                    System.out.printf("%s\t%,7d%7.1f%n",
                        p.prefecture(),
                        p.population(),
                        p.rate());
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
