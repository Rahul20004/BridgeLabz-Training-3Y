import java.util.Scanner;

public class FindStringLength {

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

    
        int customLength = getLength(text);

  
        int builtInLength = text.length();

   
        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

        sc.close();
    }
}
