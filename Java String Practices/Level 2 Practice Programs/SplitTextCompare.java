import java.util.Scanner;

public class SplitTextCompare {

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

    public static String[] customSplit(String text) {
        int length = getLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                StringBuilder sb = new StringBuilder();
                for (int j = start; j < i; j++) {
                    sb.append(text.charAt(j));
                }
                words[wordIndex++] = sb.toString();
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // User-defined split
        String[] customWords = customSplit(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare both arrays
        boolean isSame = compareArrays(customWords, builtInWords);

        // Display results
        System.out.println("Words using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("Words using built-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("Are both splits same? " + isSame);

        sc.close();
    }
}
