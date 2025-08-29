import java.util.*;

public class MatrixAdvanced {
    static double[][] generate(int n){
        double[][] m=new double[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) m[i][j]=(int)(Math.random()*10);
        return m;
    }
    static double[][] transpose(double[][] m){
        int n=m.length;
        double[][] t=new double[n][n];
        for(int i=0;i<n;i++) for(int j=0;j<n;j++) t[i][j]=m[j][i];
        return t;
    }
    static double det2(double[][] m){
        return m[0][0]*m[1][1]-m[0][1]*m[1][0];
    }
    static double det3(double[][] m){
        return m[0][0]*(m[1][1]*m[2][2]-m[1][2]*m[2][1])-
               m[0][1]*(m[1][0]*m[2][2]-m[1][2]*m[2][0])+
               m[0][2]*(m[1][0]*m[2][1]-m[1][1]*m[2][0]);
    }
    static double[][] inv2(double[][] m){
        double d=det2(m);
        return new double[][]{{m[1][1]/d,-m[0][1]/d},{-m[1][0]/d,m[0][0]/d}};
    }
    static double[][] inv3(double[][] m){
        double d=det3(m);
        double[][] inv=new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                double[][] minor=new double[2][2];
                int r=0;
                for(int x=0;x<3;x++) if(x!=i){
                    int c=0;
                    for(int y=0;y<3;y++) if(y!=j){
                        minor[r][c]=m[x][y];c++;
                    }
                    r++;
                }
                inv[j][i]=(((i+j)%2==0?1:-1)*det2(minor))/d;
            }
        }
        return inv;
    }
    static void display(double[][] m){
        for(double[] row:m){for(double v:row) System.out.printf("%.2f ",v);System.out.println();}
    }
    public static void main(String[] args){
        double[][] m2=generate(2),m3=generate(3);
        System.out.println("2x2 Matrix:");display(m2);
        System.out.println("Transpose:");display(transpose(m2));
        System.out.println("Determinant: "+det2(m2));
        System.out.println("Inverse:");display(inv2(m2));
        System.out.println("3x3 Matrix:");display(m3);
        System.out.println("Transpose:");display(transpose(m3));
        System.out.println("Determinant: "+det3(m3));
        System.out.println("Inverse:");display(inv3(m3));
    }
}
