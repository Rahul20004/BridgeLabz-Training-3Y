import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Radius of Cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter Reight of Cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of the Cylinder: " + volume);
    }
}
