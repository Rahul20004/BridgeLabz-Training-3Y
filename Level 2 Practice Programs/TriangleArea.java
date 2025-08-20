import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInch2 = areaCm2 / 6.4516;

        System.out.println("The Area of the triangle in sq in is " + areaInch2 +
                           " and sq cm is " + areaCm2);

        sc.close();
    }
}
