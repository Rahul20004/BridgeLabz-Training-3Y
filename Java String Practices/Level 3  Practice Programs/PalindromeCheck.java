import java.util.Scanner;

public class PalindromeCheck {
    public static boolean checkIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean checkRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkRecursive(text, start + 1, end - 1);
    }

    public static boolean checkUsingArray(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = text.charAt(arr.length - 1 - i);
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(checkIterative(text));
        System.out.println(checkRecursive(text, 0, text.length() - 1));
        System.out.println(checkUsingArray(text));
    }
}

