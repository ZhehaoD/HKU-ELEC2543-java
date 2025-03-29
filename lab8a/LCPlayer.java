public class LCPlayer extends Player{
    public LCPlayer(String name) {
        super(name);
    }

    public Card playCard(){
        if (cards.size() == 0) return null;
        return super.cards.remove(super.cards.size() - 1)
    }
}
