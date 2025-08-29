import java.util.*;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] data=new double[10][4];
        double totalOld=0,totalNew=0,totalBonus=0;
        for(int i=0;i<10;i++){
            double salary=10000+Math.random()*90000;
            int years=(int)(1+Math.random()*10);
            double bonus=salary*(years>5?0.05:0.02);
            double newSalary=salary+bonus;
            data[i][0]=salary;data[i][1]=years;data[i][2]=bonus;data[i][3]=newSalary;
            totalOld+=salary;totalNew+=newSalary;totalBonus+=bonus;
        }
        System.out.println("Salary\tYears\tBonus\tNewSalary");
        for(int i=0;i<10;i++){
            System.out.printf("%.2f\t%.0f\t%.2f\t%.2f\n",data[i][0],data[i][1],data[i][2],data[i][3]);
        }
        System.out.println("Total Old Salary: "+totalOld);
        System.out.println("Total New Salary: "+totalNew);
        System.out.println("Total Bonus Paid: "+totalBonus);
    }
}
