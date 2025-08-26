import java.util.Scanner;

public class CalendarDisplay {
    public static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
    }

    public static boolean isLeapYear(int year) {
        return (year%400==0)||((year%4==0)&&(year%100!=0));
    }

    public static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)) return 29;
        return days[month-1];
    }

    public static int getFirstDayOfMonth(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println(getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(1, month, year);
        int days = getDaysInMonth(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();
        displayCalendar(month, year);
    }
}
