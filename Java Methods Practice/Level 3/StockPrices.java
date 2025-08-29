import java.util.*;

public class StockPrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        double[] prices = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price for day " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }
        double sum = 0, max = prices[0], min = prices[0];
        for (int i = 0; i < n; i++) {
            sum += prices[i];
            if (prices[i] > max) max = prices[i];
            if (prices[i] < min) min = prices[i];
        }
        double avg = sum / n;
        System.out.println("Average Price: " + avg);
        System.out.println("Highest Price: " + max);
        System.out.println("Lowest Price: " + min);
    }
}
