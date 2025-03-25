public enum Suit {
    SPADE("S"),
    HEART("H"),
    CLUB("C"),
    DIAMOND("D");

    private final String suit;

    // Constructor
    Suit(String suit) {this.suit = suit;}

    public String toString() {return suit;}
}