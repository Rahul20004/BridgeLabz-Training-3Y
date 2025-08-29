import java.util.*;

public class FootballTeamHeights {
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) heights[i] = 150 + (int)(Math.random() * 101);
        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Sum: " + findSum(heights));
        System.out.println("Mean: " + findMean(heights));
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
    }

    static int findSum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    static int findShortest(int[] arr) {
        int m = arr[0];
        for (int x : arr) m = Math.min(m, x);
        return m;
    }

    static int findTallest(int[] arr) {
        int m = arr[0];
        for (int x : arr) m = Math.max(m, x);
        return m;
    }
}
