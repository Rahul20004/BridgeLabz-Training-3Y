

public class BasicCalculator {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) { return (b != 0) ? (double)a / b : Double.NaN; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result = " + add(a, b)); break;
            case 2: System.out.println("Result = " + subtract(a, b)); break;
            case 3: System.out.println("Result = " + multiply(a, b)); break;
            case 4: System.out.println("Result = " + divide(a, b)); break;
            default: System.out.println("Invalid Choice");
        }
    }
}
