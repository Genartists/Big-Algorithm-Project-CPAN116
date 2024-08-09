
public class Dealer extends Player {

    // Constructor to initialize the dealer with the name "Dealer"
    public Dealer() {
        super("Dealer");
    }

    // Shows the dealer's first card while hiding the second card
    public void showFirstCard() {
        if (!getHand().isEmpty()) {
            System.out.println("Dealer's first card: " + getHand().get(0));
        }
    }
    
    // hits until the hand's value is 17 or higher
    public void play(Deck deck) {
        while (getValue() < 17) {
            addCard(deck.dealCard());
        }
        displayHand(); // Display the dealer's final hand after finishing the turn
    }
}