import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();
    private int round;
    public Deck(int n){
        round=n;
        add();
        convert();
    }
    private void add(){
        for (Suit s:Suit.values()) {
            for(Rank r: Rank.values()){
                cards.add(new Card (r,s));
            }
        }
    }

    private Card[] shuffled() {
        Card[] first = new Card[26];
        Card[] second = new Card[26];
        for (int i = 0; i < 26; i++) {
            first[i] = cards.get(i);
            second[i] = cards.get(i+26);
        }
        Card[] shuffled = new Card[52];
        int index =0;
        for (int i = 0; i < 26; i++) {
            shuffled[index++] = first[i];
            shuffled[index++] = second[i];
        }
        return shuffled;
    }

    private ArrayList<Card> convert() {
        for (int i = 0; i < round; i++) {
            Card[] shuffledArray = shuffled();
            cards = new ArrayList<>();
            for (Card card : shuffledArray) {
                cards.add(card);
            }
        }
        return cards;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Card card : cards) {
            str.append(card).append("\n");
        }
        return str.toString();
    }

    public Card drawCard(){
        Card number=cards.get(0);
        cards.remove(0);
        return number;
    }
}
