package test2;

import java.util.ArrayList;
import java.util.List;

import blackjack.Card;
import blackjack.Suit;

public class カードを捨てる {
    public static void main(String[] args) {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card(6, Suit.CLUB));
        hand.add(new Card(2, Suit.CLUB));
        hand.add(new Card(11, Suit.CLUB));
        hand.add(new Card(2, Suit.HEART));
        hand.add(new Card(7, Suit.SPADE));
        hand.add(new Card(5, Suit.SPADE));
        hand.add(new Card(7, Suit.DIAMOND));
        hand.add(new Card(1, Suit.CLUB));
        hand.add(new Card(5, Suit.DIAMOND));
        hand.add(new Card(7, Suit.HEART));
        
        hand.sort((c1, c2) -> c1.getNumber() - c2.getNumber());

        System.out.println("カードを捨てる前");
        printHand(hand);
        discard(hand);
        System.out.println("カードを捨てる後");
        printHand(hand);
    }
    private static void printHand(List<Card> hand) {
        for (var c: hand) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    public static void discard(List<Card> hand) {
        int i = 0;
        while (i < hand.size() - 1) {
            if (hand.get(i).getNumber() == hand.get(i + 1).getNumber()) {
                hand.remove(i + 1);
                hand.remove(i);
            } else {
                i++;
            }
        }
    }
}
