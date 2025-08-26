import java.util.Scanner;

public class ShortestLongestWord {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

     
        String[] words = new String[wordCount];
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.length() > 0) {
                words[index++] = sb.toString();
                sb.setLength(0);
            }
        }
        if (sb.length() > 0) {
            words[index] = sb.toString();
        }
        return words;
    }

    public static String[][] createWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

  
    public static int[] findShortestLongest(String[][] wordTable) {
        int shortestIndex = 0, longestIndex = 0;
        int shortestLength = Integer.parseInt(wordTable[0][1]);
        int longestLength = Integer.parseInt(wordTable[0][1]);

        for (int i = 1; i < wordTable.length; i++) {
            int currentLength = Integer.parseInt(wordTable[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a text:");
        String text = sc.nextLine();

     
        String[] words = splitText(text);

       
        String[][] wordTable = createWordLengthTable(words);

        System.out.println("\nWord\tLength");
        for (String[] row : wordTable) {
            System.out.println(row[0] + "\t" + row[1]);
        }

      
        int[] indices = findShortestLongest(wordTable);
        System.out.println("\nShortest Word: " + wordTable[indices[0]][0] +
                           " (Length: " + wordTable[indices[0]][1] + ")");
        System.out.println("Longest Word: " + wordTable[indices[1]][0] +
                           " (Length: " + wordTable[indices[1]][1] + ")");
    }
}
