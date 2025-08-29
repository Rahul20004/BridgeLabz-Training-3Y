
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year >= 1582) {
            if(isLeapYear(year)) System.out.println("Leap Year");
            else System.out.println("Not Leap Year");
        } else System.out.println("Year must be >= 1582");
    }
    static boolean isLeapYear(int y) {
        return (y%4==0 && y%100!=0) || (y%400==0);
    }
}
