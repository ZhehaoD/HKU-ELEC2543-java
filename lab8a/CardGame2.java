public class CardGame2 {

  private Player[] players;	// players in this game

  // constructor
  public CardGame2(Player[] players) {
    this.players = players;
  }

  public void play() {
    System.out.println(Player.getName()+"has cards:"+Player.getCards());

  }
}
