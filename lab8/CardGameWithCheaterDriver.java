import java.io.*;

public class CardGameWithCheaterDriver {

  public static void main(String[] args) throws IOException {

    Player[] players = InitializePlayer.getPlayers();
    CardGameWithCheater game = new CardGameWithCheater(players);
    game.play();
  }
}
