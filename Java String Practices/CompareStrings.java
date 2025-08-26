import java.util.Scanner;

public class CompareStrings {

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        boolean resultCharAt = compareStrings(s1, s2);
        boolean resultEquals = s1.equals(s2);

        System.out.println("Result using charAt(): " + resultCharAt);
        System.out.println("Result using equals(): " + resultEquals);

        sc.close();
    }
}
