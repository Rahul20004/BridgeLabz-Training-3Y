
public class Chocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + res[0] + " Remaining: " + res[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int q = number / divisor;
        int r = number % divisor;
        return new int[]{q,r};
    }
}
