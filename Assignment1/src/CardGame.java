public class CardGame {

  // YOU CANNOT DEFINE OTHER INSTANCE VARIABLES
  private Player[] players;	// players in this game
  private int numRounds;	// number of rounds in this game
  private Deck deck;		// deck of cards

  // constructor
  // YOU SHOULD NOT MODIFY THIS METHOD
  public CardGame(Player[] players) {

    this.players = players;
    deck = new Deck(5);

  }

  // implement this method
  public void play() {

    // find out the number of rounds in this game
    numRounds = 52 / players.length;

    // distribute cards among players
    for (int i = 0; i < numRounds; i++) {
      for (Player player : players) {
        player.addCard(deck.drawCard());
      }
    }
    for (int i = 0; i < numRounds; i++) {
      for (Player player : players) {
        player.printHand();
      }

      String name = players[0].getName();
      Card card = players[0].playCard();
      System.out.println(name + " plays " + card);

      for (int j = 1; j < players.length; j++) {
        String names = players[j].getName();
        Card cards = players[j].playCard();
        System.out.println(names + " plays " + cards);
        if (cards.compareTo(card) > 0) {
          name = names;
          card = cards;
        }
      }
      System.out.println("The winner of this round is " + name);
      System.out.println("");
    }

    // develop the loop for each round
    // (1) print out the cards each player has
    // (2) print out the cards each player plays
    // (3) identify the winner of this round

  }
}

