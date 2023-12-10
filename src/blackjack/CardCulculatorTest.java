package blackjack;

import java.util.List;

public class CardCulculatorTest {
    public static boolean calcTotalTestWithAce1() {
        List<Card> cards = List.of(new Card(1, Suit.CLUB), new Card(12, Suit.HEART), new Card(5, Suit.CLUB));
        int expected = 16;
        return expected == CardCulculator.calcTotal(cards);
    }
    public static boolean calcTotalTestWithAce2() {
        List<Card> cards = List.of(new Card(1, Suit.CLUB), new Card(1, Suit.HEART), new Card(10, Suit.CLUB));
        int expected = 12;
        return expected == CardCulculator.calcTotal(cards);
    }
    public static boolean calcTotalTestWithAce3() {
        List<Card> cards = List.of(new Card(1, Suit.CLUB), new Card(1, Suit.HEART), new Card(1, Suit.DIAMOND));
        int expected = 12;
        return expected == CardCulculator.calcTotal(cards);
    }
    public static void main(String[] args) {
        int totalCounter = 0;
        int okCounter = 0;
        
        if (calcTotalTestWithAce1()) {
            okCounter++;
        }
        totalCounter++;
        
        if (calcTotalTestWithAce2()) {
            okCounter++;
        }
        totalCounter++;
        System.out.println(okCounter == totalCounter ? "合格": "不合格");
    }
}
