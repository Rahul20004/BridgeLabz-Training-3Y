
import java.util.*;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = checkNumber(n);
        if(result == -1) System.out.println("Negative");
        else if(result == 1) System.out.println("Positive");
        else System.out.println("Zero");
    }
    static int checkNumber(int n) {
        if(n < 0) return -1;
        if(n > 0) return 1;
        return 0;
    }
}
