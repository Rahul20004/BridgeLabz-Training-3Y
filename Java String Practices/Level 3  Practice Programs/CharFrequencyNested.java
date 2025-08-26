import java.util.Scanner;

public class CharFrequencyNested {
    public static String[] getFrequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < len; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }
        String[] result = new String[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        String[] finalResult = new String[index];
        System.arraycopy(result, 0, finalResult, 0, index);
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] result = getFrequency(text);
        for (String s : result) {
            System.out.println(s);
        }
    }
}

