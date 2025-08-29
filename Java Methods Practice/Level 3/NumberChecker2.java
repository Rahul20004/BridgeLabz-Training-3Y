import java.util.*;
public class NumberChecker2 {
    public static int[] digitsArray(int n){
        String s=String.valueOf(n);int[] d=new int[s.length()];
        for(int i=0;i<s.length();i++) d[i]=s.charAt(i)-'0';return d;
    }
    public static int sum(int[] d){int s=0;for(int x:d)s+=x;return s;}
    public static int sumSquares(int[] d){int s=0;for(int x:d)s+=Math.pow(x,2);return s;}
    public static boolean isHarshad(int n){return n%sum(digitsArray(n))==0;}
    public static int[][] frequency(int[] d){
        int[][] f=new int[10][2];for(int i=0;i<10;i++)f[i][0]=i;
        for(int x:d)f[x][1]++;return f;
    }
    public static void main(String[] a){
        int n=21;int[] d=digitsArray(n);
        System.out.println("Sum:"+sum(d));
        System.out.println("SumSquares:"+sumSquares(d));
        System.out.println("Harshad:"+isHarshad(n));
        System.out.println("Freq:");
        for(int[] x:frequency(d)) if(x[1]>0) System.out.println(x[0]+"->"+x[1]);
    }
}
