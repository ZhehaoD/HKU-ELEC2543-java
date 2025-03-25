public enum Suit {
    SPADE("SPADE"),
    HEART("HEART"),
    CLUB("CLUB"),
    DIAMOND("DIAMOND");

    private final String suit;

    // Constructor
    Suit(String suit) {this.suit = suit;}

    public String toString() {return suit;}
}