public class CardGame2 {

  private Player[] players;    // players in this game

  // constructor
  public CardGame2(Player[] players) {
    this.players = players;
  }

  public void play() {
    for (int round = 0; round < 5; round++) {
      // 打印每个玩家当前手牌
      for (Player player : players) {
        System.out.print(player.getName() + " has cards: " + player.cards + "\n");
      }
    }
  }
}