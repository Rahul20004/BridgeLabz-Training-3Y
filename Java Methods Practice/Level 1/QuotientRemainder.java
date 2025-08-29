
import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] res = findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient: " + res[0] + " Remainder: " + res[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int q = number / divisor;
        int r = number % divisor;
        return new int[]{q,r};
    }
}
