import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;
    
    // Constructor to create a deck of 52 cards
    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        cards = new ArrayList<>();

        // the deck with all combinations of suits and ranks
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        shuffle(); // Shuffle the deck after creating it
    }

    // Shuffles the deck to randomize the order of the cards
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Deals (removes and returns) the top card from the deck
    public Card dealCard() {
        return cards.remove(cards.size() - 1);
    }
}
