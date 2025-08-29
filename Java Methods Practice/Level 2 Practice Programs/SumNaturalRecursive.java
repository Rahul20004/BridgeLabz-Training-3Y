
import java.util.*;
public class SumNaturalRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 0) System.out.println("Not a natural number");
        else {
            int rec = recursiveSum(n);
            int formula = formulaSum(n);
            System.out.println("Recursive Sum: " + rec);
            System.out.println("Formula Sum: " + formula);
        }
    }
    static int recursiveSum(int n) {
        if(n == 1) return 1;
        return n + recursiveSum(n-1);
    }
    static int formulaSum(int n) {
        return n*(n+1)/2;
    }
}
