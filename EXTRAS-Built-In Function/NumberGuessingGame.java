
import java.util.*;

public class NumberGuessingGame {
    static Random rand = new Random();

    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean guessed = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("Respond with: 'high', 'low', or 'correct'.");

        while (!guessed && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Your feedback: ");
            String feedback = sc.nextLine().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed correctly!");
                guessed = true;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }
    }
}
