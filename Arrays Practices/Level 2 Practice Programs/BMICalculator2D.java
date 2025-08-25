import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // height, weight, BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double height, weight;
            do {
                System.out.println("Enter positive height (in meters) for person " + (i + 1) + ":");
                height = sc.nextDouble();
            } while (height <= 0);

            do {
                System.out.println("Enter positive weight (in kg) for person " + (i + 1) + ":");
                weight = sc.nextDouble();
            } while (weight <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][0], personData[i][1], personData[i][2], status[i]);
        }

        sc.close();
    }
}
