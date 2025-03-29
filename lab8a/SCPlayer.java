public class SCPlayer extends Player{
    public Card playCard(){
        if (cards.size() == 0) return null;
        return super.cards.remove(super.cards.size(0));
    }
}
