
import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;

        int max = 0;
        char ans = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                ans = c;
            }
        }
        System.out.println("Most Frequent Character: " + ans);
    }
}
