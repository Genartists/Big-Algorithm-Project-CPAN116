import java.util.Scanner;

public class Game {
    private Deck deck;
    private Player player;
    private Dealer dealer;
    
    // Constructor to set the game, deck, player, and dealer
    public Game() {
        deck = new Deck();
        player = new Player("Player");
        dealer = new Dealer();
    }

    public void play() {
        // Initial dealing of two cards each to the player and dealer
        for (int i = 0; i < 2; i++) {
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
        }

        // show initial hands
        player.displayHand();
        dealer.showFirstCard();

        // Player's turn: allow the player to hit or stand
        Scanner scanner = new Scanner(System.in);
        while (player.getValue() < 21) {
            System.out.print("Do you want to hit or stand? (hit/stand): ");
            String action = scanner.nextLine().trim().toLowerCase();
            if (action.equals("hit")) {
                player.addCard(deck.dealCard());
                player.displayHand();
            } else if (action.equals("stand")) {
                break;
            } else {
                System.out.println("Invalid input. Please type 'hit' or 'stand'.");
            }
        }

        // Dealer's turn
        if (!player.isBusted()) {
            dealer.play(deck);
        }

        // Show final hands and determine the winner
        determineWinner();
    }

    private void determineWinner() {
        int playerValue = player.getValue();
        int dealerValue = dealer.getValue();

        System.out.println("Final Results:");
        player.displayHand();
        dealer.displayHand();

        // Compare hand values and declare the winner
        if (player.isBusted()) {
            System.out.println("Player busts! Dealer wins.");
        } else if (dealer.isBusted()) {
            System.out.println("Dealer busts! Player wins.");
        } else if (playerValue > dealerValue) {
            System.out.println("Player wins!");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}