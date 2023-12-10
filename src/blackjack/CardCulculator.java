package blackjack;

import java.util.List;

public class CardCulculator {
    public static int calcTotal(List<Card> hand) {
        int total = 0;
        int aceCount = 0;
        for (Card c: hand) {
            int number = c.getNumber();
            if (number == 1) {
                total += 11;
                aceCount++;
            } else if (number == 11 || number == 12 || number == 13) {
                total += 10;
            } else {
                total += number;
            }
        }
        while (aceCount > 0 && total > 21) {
            total -= 10; // 11から1へ変更するため10減算する
            aceCount--;
        } 
        return total;
    }
}
