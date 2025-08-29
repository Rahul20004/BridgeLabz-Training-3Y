
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] factors = findFactors(num);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sumFactors(factors));
        System.out.println("Sum of Squares: " + sumOfSquares(factors));
        System.out.println("Product: " + productFactors(factors));
    }
    static int[] findFactors(int num) {
        int count = 0;
        for(int i=1;i<=num;i++) if(num % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for(int i=1;i<=num;i++) if(num % i == 0) factors[index++] = i;
        return factors;
    }
    static int sumFactors(int[] arr) {
        int sum = 0;
        for(int x: arr) sum += x;
        return sum;
    }
    static int productFactors(int[] arr) {
        int prod = 1;
        for(int x: arr) prod *= x;
        return prod;
    }
    static int sumOfSquares(int[] arr) {
        int sum = 0;
        for(int x: arr) sum += Math.pow(x,2);
        return sum;
    }
}
