import java.util.*;

public class ZaraBonus {
    public static void main(String[] args) {
        double[] salary = new double[10];
        int[] years = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            salary[i] = 20000 + rand.nextInt(30000);
            years[i] = 1 + rand.nextInt(10);
        }
        double totalBonus = 0;
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "EmpID", "Salary", "Years", "Bonus", "NewSalary");
        for (int i = 0; i < 10; i++) {
            double bonus = (years[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            double newSalary = salary[i] + bonus;
            totalBonus += bonus;
            System.out.printf("%-10d %-10.2f %-10d %-10.2f %-10.2f\n", (i + 1), salary[i], years[i], bonus, newSalary);
        }
        System.out.println("Total Bonus Paid by Company: " + totalBonus);
    }
}
