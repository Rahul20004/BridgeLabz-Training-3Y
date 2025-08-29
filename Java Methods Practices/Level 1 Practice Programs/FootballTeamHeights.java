
import java.util.*;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        int sum = findSum(heights);
        double mean = findMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest);
        System.out.println("Tallest: " + tallest);
    }

    static int findSum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    static double findMean(int sum, int count) {
        return (double) sum / count;
    }

    static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) if (n > max) max = n;
        return max;
    }
}
