
import java.util.*;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(isSpring(month, day)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
    static boolean isSpring(int month, int day) {
        if((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) return true;
        return false;
    }
}
