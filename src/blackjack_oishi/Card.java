package blackjack_oishi;

// ※他のトランプゲームでも共通で使用できることを考慮
public class Card {
  private Suit mark;
  
  // 数字(1,2,3,4,5,6,7,8,9,10,11,12,13)
  private int num;

  public Card() {}
  public Card(int num,Suit mark) {
    this.mark = mark;
    this.num = num;
  }

  public Suit getMark() {
    return mark;
  }

  public int getNum() {
    return num;
  }

  @Override
  public String toString() {
    return "Card [mark=" + mark + ", num=" + num + "]";
  }
}
