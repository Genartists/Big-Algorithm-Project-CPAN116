// this class is a playing card with a suit and rank
public class Card {
    private String suit;
    private String rank;

    // Constructor to initialize the card with a specific suit and rank
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    // Gets the rank of the card
    public String getRank() {
        return rank;
    }

    // Gets the value of the card based on its rank
    public int getValue() {
        switch (rank) {
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            case "Ace":
                return 11;
            default:
                return Integer.parseInt(rank);
        }
    }
    // Provides a string representation of the card (e.g., "Ace of Spades")
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}