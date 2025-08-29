import java.util.*;
public class NumberChecker1 {
    public static int countDigits(int n){return String.valueOf(n).length();}
    public static int[] digitsArray(int n){
        String s=String.valueOf(n);int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';return d;
    }
    public static boolean isDuck(int[] d){for(int x:d) if(x==0) return true; return false;}
    public static boolean isArmstrong(int n){
        int[] d=digitsArray(n);int p=d.length;int s=0;
        for(int x:d) s+=Math.pow(x,p);return s==n;
    }
    public static int[] largestTwo(int[] d){
        int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
        for(int x:d){if(x>f){s=f;f=x;}else if(x>s&&x!=f)s=x;}return new int[]{f,s};
    }
    public static int[] smallestTwo(int[] d){
        int f=Integer.MAX_VALUE,s=Integer.MAX_VALUE;
        for(int x:d){if(x<f){s=f;f=x;}else if(x<s&&x!=f)s=x;}return new int[]{f,s};
    }
    public static void main(String[] args){
        int n=153;int[] d=digitsArray(n);
        System.out.println("Digits:"+Arrays.toString(d));
        System.out.println("Duck:"+isDuck(d));
        System.out.println("Armstrong:"+isArmstrong(n));
        System.out.println("Largest Two:"+Arrays.toString(largestTwo(d)));
        System.out.println("Smallest Two:"+Arrays.toString(smallestTwo(d)));
    }
}
