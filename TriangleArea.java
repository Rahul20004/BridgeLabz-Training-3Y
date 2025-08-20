import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / 6.4516; // since 1 inch² = 6.4516 cm²

        System.out.println("The area of triangle is " + areaCm2 + " cm² and " +
                           areaInches2 + " inch²");

        sc.close();
    }
}
