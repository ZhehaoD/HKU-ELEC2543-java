public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return suit +""+ rank;
    }

    public int compareTo(Card c) {
        if (this.rank.compareTo(c.rank) > 0) {
            return 1;
        }
        else if (this.rank.compareTo(c.rank) < 0) {
            return -1;
        }
        else if (this.suit.compareTo(c.suit)> 0){
            return 1;
        }
        else if (this.suit.compareTo(c.suit) < 0) {
            return -1;
        }
        else{
            return 0;
        }
    }
}
