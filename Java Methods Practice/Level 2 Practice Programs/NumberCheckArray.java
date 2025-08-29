
public class NumberCheckArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++) {
            arr[i] = sc.nextInt();
            if(isPositive(arr[i])) {
                System.out.print("Positive ");
                if(isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else System.out.println("Negative");
        }
        int comp = compare(arr[0], arr[4]);
        if(comp == 0) System.out.println("First and Last are equal");
        else if(comp == 1) System.out.println("First greater");
        else System.out.println("First smaller");
    }
    static boolean isPositive(int n) { return n >= 0; }
    static boolean isEven(int n) { return n % 2 == 0; }
    static int compare(int a,int b) { return a>b?1:(a==b?0:-1); }
}
