import java.util.Scanner;

public class CharFrequencyUnique {
    public static char[] getUniqueChars(String text) {
        int len = text.length();
        char[] result = new char[len];
        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                result[count++] = c;
            }
        }
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) uniqueChars[i] = result[i];
        return uniqueChars;
    }

    public static String[][] getFrequency(String text) {
        char[] uniqueChars = getUniqueChars(text);
        String[][] result = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == c) count++;
            }
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = getFrequency(text);
        for (String[] row : result) {
            System.out.println(row[0] + " : " + row[1]);
        }
    }
}

