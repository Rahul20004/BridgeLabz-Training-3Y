
import java.util.*;
public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        int[] heights = new int[3];
        for(int i=0;i<3;i++) ages[i] = sc.nextInt();
        for(int i=0;i<3;i++) heights[i] = sc.nextInt();
        System.out.println("Youngest: " + findYoungest(ages));
        System.out.println("Tallest: " + findTallest(heights));
    }
    static String findYoungest(int[] ages) {
        int min = 0;
        for(int i=1;i<3;i++) if(ages[i] < ages[min]) min = i;
        return new String[]{"Amar","Akbar","Anthony"}[min];
    }
    static String findTallest(int[] heights) {
        int max = 0;
        for(int i=1;i<3;i++) if(heights[i] > heights[max]) max = i;
        return new String[]{"Amar","Akbar","Anthony"}[max];
    }
}
