import java.util.*;
public class NumberChecker3 {
    public static int[] digitsArray(int n){
        String s=String.valueOf(n);int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';return d;
    }
    public static int[] reverse(int[] d){
        int[] r=new int[d.length];for(int i=0;i<d.length;i++)r[i]=d[d.length-1-i];return r;
    }
    public static boolean equal(int[] a,int[] b){return Arrays.equals(a,b);}
    public static boolean palindrome(int n){
        int[] d=digitsArray(n);return equal(d,reverse(d));
    }
    public static boolean duck(int[] d){for(int x:d) if(x==0) return true; return false;}
    public static void main(String[] args){
        int n=1221;int[] d=digitsArray(n);
        System.out.println("Palindrome:"+palindrome(n));
        System.out.println("Duck:"+duck(d));
    }
}
