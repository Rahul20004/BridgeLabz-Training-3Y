import java.util.*;

public class RockPaperScissorsGame {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) return "User";
        return "Computer";
    }

    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";
        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(compWins);
        stats[0][2] = String.format("%.2f%%", (userWins * 100.0) / games);
        stats[1][2] = String.format("%.2f%%", (compWins * 100.0) / games);
        return stats;
    }

    public static void displayGameResults(List<String[]> results, String[][] stats) {
        System.out.printf("%-10s%-15s%-15s%-10s%n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("----------------------------------------------------------");
        int i = 1;
        for (String[] row : results) {
            System.out.printf("%-10d%-15s%-15s%-10s%n", i++, row[0], row[1], row[2]);
        }
        System.out.println("\nSummary:");
        System.out.printf("%-10s%-10s%-10s%n", "Player", "Wins", "Win%");
        for (String[] row : stats) {
            System.out.printf("%-10s%-10s%-10s%n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;
        List<String[]> results = new ArrayList<>();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = getWinner(userChoice, compChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            results.add(new String[]{userChoice, compChoice, winner});
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayGameResults(results, stats);
    }
}
