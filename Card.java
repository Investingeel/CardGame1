package DesignAnalys;



public class Card {

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getRankValue() {
        return this.rank.getValue();
    }

    public int getSuitValue() {
        return this.suit.ordinal();
    }

    public boolean equals(DesignAnalys.Card other) {
        return this.rank == other.rank && this.suit == other.suit;
    }

    public String toString() {
        String info = this.rank + " of " + this.suit;
        return info;
    }
}

