import java.util.Scanner;

public class BMICalculator {
    public static double calculateBMI(double weight, double height) {
        double heightInMeters = height / 100;
        return weight / (heightInMeters * heightInMeters);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static String[][] computeBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double bmi = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.valueOf(data[i][0]);
            result[i][1] = String.valueOf(data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.printf("%-10s%-10s%-10s%-15s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("-----------------------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s%-10s%-10s%-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] input = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            input[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            input[i][1] = sc.nextDouble();
        }
        String[][] result = computeBMI(input);
        display(result);
    }
}
