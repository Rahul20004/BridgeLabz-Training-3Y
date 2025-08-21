import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

       
        System.out.print("Enter Amar's height: ");
        int hAmar = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int hAkbar = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int hAnthony = sc.nextInt();

        if (ageAmar < ageAkbar && ageAmar < ageAnthony)
            System.out.println("Youngest: Amar");
        else if (ageAkbar < ageAnthony)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

       
        if (hAmar > hAkbar && hAmar > hAnthony)
            System.out.println("Tallest: Amar");
        else if (hAkbar > hAnthony)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}
