public class CheatPlayer extends Player{
    private Deck deck;

    public CheatPlayer(String name, Deck deck) {
        super(name);
        this.deck = deck;
    }
    public void cheat(){
        if(!deck.isEmpty() && cards.size()>0){
            Card newCard = deck.drawCard();
            cards.remove(0);
            addCard(newCard);
        }
    }
    public Card playCard(){
        if (cards.size() == 0) return null;
        return super.cards.remove(super.cards.size() - 1);
    }
}
