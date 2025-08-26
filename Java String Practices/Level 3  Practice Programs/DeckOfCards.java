import java.util.Scanner;

public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[random];
            deck[random] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) return null;
        String[][] result = new String[players][cards];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                result[i][j] = deck[index++];
            }
        }
        return result;
    }

    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int cards = sc.nextInt();
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        String[][] distributed = distributeCards(deck, players, cards);
        if (distributed != null) printPlayers(distributed);
        else System.out.println("Not enough cards");
    }
}
