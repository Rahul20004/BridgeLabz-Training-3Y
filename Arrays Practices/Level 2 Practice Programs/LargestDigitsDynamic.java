import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        
        int[] digits = new int[10]; 
        int size = 0;

        
        while (number > 0) {
            if (size == digits.length) {
                // Resize array when full (increase size by 10)
                int[] newArray = new int[digits.length + 10];
                for (int i = 0; i < digits.length; i++) {
                    newArray[i] = digits[i];
                }
                digits = newArray;
            }

            digits[size++] = (int) (number % 10);
            number /= 10;
        }

        if (size < 2) {
            System.out.println("Not enough digits to find second largest.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

      
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}
