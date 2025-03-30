public class CardGameWithCheater {
    private Player[] players;    // players in this game

    // constructor
    public CardGameWithCheater(Player[] players) {
        this.players = players;
    }

    public void play() {
        for (int i = 0; i < players.length+1; i++) {
            for (Player player : players) {
                player.printHand();
            }

            String name = players[0].getName();
            Card card = players[0].playCard();
            System.out.println(name + " plays " + card);

            for (int j = 1; j < players.length; j++) {
                if(players[j] instanceof CheatPlayer){
                    CheatPlayer cheatPlayer =(CheatPlayer) players[j];
                    System.out.println(players[j].getName()+" cheats ...");
                    cheatPlayer.cheat();
                    players[j].printHand();
                }
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
    }
}
