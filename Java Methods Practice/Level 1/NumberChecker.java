public class NumberChecker {
    public static void main(String[] args) {
        int num = 153;

        System.out.println("Count Digits: " + countDigits(num));
        int[] digits = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck: " + isDuck(num));
        System.out.println("Armstrong: " + isArmstrong(num));
        System.out.println("Largest and Second Largest: " + Arrays.toString(findLargest(digits)));
        System.out.println("Smallest and Second Smallest: " + Arrays.toString(findSmallest(digits)));

        System.out.println("Sum Digits: " + sumDigits(digits));
        System.out.println("Sum Squares Digits: " + sumSquaresDigits(digits));
        System.out.println("Harshad: " + isHarshad(num));
        System.out.println("Frequency: " + Arrays.deepToString(digitFrequency(digits)));

        System.out.println("Reversed: " + Arrays.toString(reverseDigits(digits)));
        System.out.println("Palindrome: " + isPalindrome(num));
        System.out.println("Prime: " + isPrime(num));
        System.out.println("Neon: " + isNeon(9));
        System.out.println("Spy: " + isSpy(1124));
        System.out.println("Automorphic: " + isAutomorphic(25));
        System.out.println("Buzz: " + isBuzz(27));
        System.out.println("Perfect: " + isPerfect(28));
        System.out.println("Abundant: " + isAbundant(12));
        System.out.println("Deficient: " + isDeficient(8));
        System.out.println("Strong: " + isStrong(145));
    }

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static boolean isDuck(int num) {
        String s = String.valueOf(num);
        return s.contains("0");
    }

    static boolean isArmstrong(int num) {
        int[] d = getDigits(num);
        int pow = d.length;
        int sum = 0;
        for (int x : d) sum += Math.pow(x, pow);
        return sum == num;
    }

    static int[] findLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n != max1) {
                max2 = n;
            }
        }
        return new int[]{max1, max2};
    }

    static int[] findSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2 && n != min1) {
                min2 = n;
            }
        }
        return new int[]{min1, min2};
    }

    static int sumDigits(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    static int sumSquaresDigits(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    static boolean isHarshad(int num) {
        int[] d = getDigits(num);
        int sum = sumDigits(d);
        return num % sum == 0;
    }

    static int[][] digitFrequency(int[] arr) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int x : arr) freq[x][1]++;
        return freq;
    }

    static int[] reverseDigits(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    static boolean isPalindrome(int num) {
        String s = String.valueOf(num);
        return new StringBuilder(s).reverse().toString().equals(s);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) if (num % i == 0) return false;
        return true;
    }

    static boolean isNeon(int num) {
        int sq = num * num;
        int[] d = getDigits(sq);
        return sumDigits(d) == num;
    }

    static boolean isSpy(int num) {
        int[] d = getDigits(num);
        int sum = 0, prod = 1;
        for (int x : d) {
            sum += x;
            prod *= x;
        }
        return sum == prod;
    }

    static boolean isAutomorphic(int num) {
        int sq = num * num;
        return String.valueOf(sq).endsWith(String.valueOf(num));
    }

    static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum == num;
    }

    static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum > num;
    }

    static boolean isDeficient(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) if (num % i == 0) sum += i;
        return sum < num;
    }

    static int fact(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) f *= i;
        return f;
    }

    static boolean isStrong(int num) {
        int[] d = getDigits(num);
        int sum = 0;
        for (int x : d) sum += fact(x);
        return sum == num;
    }
}
