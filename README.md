# Big-Algorithm-Project-CPAN116
 I this project i used  the Card class as encapsulates the properties of a card (suit and rank). The Player class encapsulates the player's name, hand, and the current value of the hand. Methods like addCard(), getValue(), and isBusted() allow controlled interaction with the player's state.
 For Inheritance feature, I make the Dealer class inherits from the Player class which allows the dealer to have the same basic functionality as a player while showing the first card and playing according to the rules of Blackjack.
 Polymorphism happen When i override the toString() method in the Card class, returning a string in the format "rank of suit".
 Abstraction feature is when i make the Game class abstracts the entire flow of the game, managing the interactions between the deck, the player, and the dealer.
# Compiling and game running instruction
For each file that i created here: 
 Card.java
 Deck.java
 Player.java
 Dealer.java
 Game.java
 Main.java
 
 1. Just download the src folder that contain all the files above.
 2. To complile every files, just get into terminal or command prompt and then go to the src folder that was just downloaded. 
 3. Then Type javac *.java to compile all files at once, it will create .class files in the same directory.
 4. Finally, to run the game you just have to type java Main, the game will start, and you will see the initial hands of the player and the dealer displayed in the terminal.

# Gameplay
After run the game, it will shuffle and display the ramdon card of your and the dealer with the value that each person gained
And then a text will appear ask you that "Do you want to hit or stand? (hit/stand):"
You can type "hit" to take another card or "stand" to stop taking cards and let the dealer play.
The game will continue according to the rules of Blackjack, and the output which determin you or the dealer is a winner will be displayed at the end.






