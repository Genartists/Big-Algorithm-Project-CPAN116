import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;
    private int value;
    private int aces;

    // Constructor to setup the player with a name
    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
        this.value = 0;
        this.aces = 0;
    }

    // Adds a card to the player's hand and adjusts the hand's value
    public void addCard(Card card) {
        hand.add(card);
        value += card.getValue();
        if (card.getRank().equals("Ace")) {
            aces++; // Track the number of Aces in the hand
        }
        adjustForAce(); // Adjust the hand's value if there are Aces
    }

    // Adjusts the value of the hand if it contains Aces and the total value exceeds 21
    private void adjustForAce() {
        while (value > 21 && aces > 0) {
            value -= 10; // Treat one Ace as 1 instead of 11
            aces--;
        }
    }

    // Gets the total value of the player's hand
    public int getValue() {
        return value;
    }

    // Checks if the player's hand value exceeds 21
    public boolean isBusted() {
        return value > 21;
    }

    // Displays the cards in the player's hand and the total value
    public void displayHand() {
        System.out.print(name + "'s hand: ");
        for (Card card : hand) {
            System.out.print(card + " ");
        }
        System.out.println(", Value: " + value);
    }

    public List<Card> getHand() {
        return hand;
    }
}