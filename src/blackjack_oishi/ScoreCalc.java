package blackjack_oishi;

import java.util.List;

public class ScoreCalc {
  
  // A -> 1 or 11
  // J,Q K -> 10

  // エースを11点と計算する。
  // エースの枚数を持っておく
  public static int calcTotalScore(List<Card> cards) {
    int total = 0;
    int aceCnt = 0;
    for ( Card card : cards ) {
      int cardNum = card.getNum();
      if ( cardNum == 1 ) {
        total += 11;
        aceCnt++;
      // J,Q,Kは10点
      } else if ( cardNum >= 11 && cardNum <= 13 ) {
        total += 10;
      } else {
        total += cardNum;
      }
    }
    // Aを持っているか
    while (aceCnt > 0 && total < 21) {
      total -= 10;
      aceCnt--;
    }
    return total;
  }

  // 21より大きいか
  public boolean over21(int total) {
    return total > 21;
  }
}
