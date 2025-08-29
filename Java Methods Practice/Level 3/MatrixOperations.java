import java.util.*;

public class MatrixOperations {
    static int[][] generate(int r,int c){
        int[][] m=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    static int[][] add(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    static int[][] sub(int[][] a,int[][] b){
        int[][] res=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++) for(int j=0;j<a[0].length;j++) res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    static int[][] mul(int[][] a,int[][] b){
        int[][] res=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++) for(int j=0;j<b[0].length;j++) for(int k=0;k<a[0].length;k++) res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    static void display(int[][] m){
        for(int[] row:m){for(int v:row) System.out.print(v+" ");System.out.println();}
    }
    public static void main(String[] args){
        int[][] a=generate(2,2),b=generate(2,2);
        System.out.println("Matrix A:");display(a);
        System.out.println("Matrix B:");display(b);
        System.out.println("Addition:");display(add(a,b));
        System.out.println("Subtraction:");display(sub(a,b));
        System.out.println("Multiplication:");display(mul(a,b));
    }
}
