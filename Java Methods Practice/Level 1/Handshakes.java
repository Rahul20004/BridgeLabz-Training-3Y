
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int h = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes: " + h);
    }
    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}
