import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();

        String numStr = String.valueOf(num);
        int length = numStr.length();
        int[] digits = new int[length];

        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        System.out.print("Reversed Number: ");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
