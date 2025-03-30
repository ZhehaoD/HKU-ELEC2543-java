// YOU CANNOT MODIFY THIS FILE
public class InitializePlayer {

  public static Player[] getPlayers() {
    Player players[] = new Player[4];

    // Prepare a deck of cards
    Deck deck = new Deck();

    players[0] = new SCPlayer("John");
    players[1] = new CheatPlayer("Mary", deck);
    players[2] = new LCPlayer("Peter");
    players[3] = new LCPlayer("Susan");


    // each player gets 5 cards
    for (int i = 0; i < 5; i++) {
      for (Player p : players)
	p.addCard(deck.drawCard());
    }

    return players;
  }
}
