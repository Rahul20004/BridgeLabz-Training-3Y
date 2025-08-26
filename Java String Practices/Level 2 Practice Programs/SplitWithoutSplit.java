import java.util.*;

public class SplitTextComparison {

   
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (Exception e) {
            
        }
        return count;
    }

    public static String[] splitText(String str) {
        int len = findLength(str);
        
  
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaces = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaces[idx++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = str.substring(start, spaces[i]);
            start = spaces[i] + 1;
        }
        words[wordCount - 1] = str.substring(start, len);
        
        return words;
    }


    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = sc.nextLine();


        String[] manualSplit = splitText(input);

        String[] builtInSplit = input.split(" ");

        boolean result = compareArrays(manualSplit, builtInSplit);

        System.out.println("Manual Split:");
        System.out.println(Arrays.toString(manualSplit));

        System.out.println("Built-in Split:");
        System.out.println(Arrays.toString(builtInSplit));

        System.out.println("Are both arrays equal? " + result);

        sc.close();
    }
}
