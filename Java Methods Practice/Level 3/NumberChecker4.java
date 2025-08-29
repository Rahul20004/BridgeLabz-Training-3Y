public class NumberChecker4 {
    public static boolean prime(int n){
        if(n<2)return false;for(int i=2;i<=Math.sqrt(n);i++)if(n%i==0)return false;return true;
    }
    public static boolean neon(int n){
        int sq=n*n;int s=0;while(sq>0){s+=sq%10;sq/=10;}return s==n;
    }
    public static boolean spy(int n){
        int s=0,p=1;while(n>0){int d=n%10;s+=d;p*=d;n/=10;}return s==p;
    }
    public static boolean automorphic(int n){return String.valueOf(n*n).endsWith(String.valueOf(n));}
    public static boolean buzz(int n){return n%7==0||n%10==7;}
    public static void main(String[] args){
        int n=7;
        System.out.println("Prime:"+prime(n));
        System.out.println("Neon:"+neon(n));
        System.out.println("Spy:"+spy(n));
        System.out.println("Automorphic:"+automorphic(n));
        System.out.println("Buzz:"+buzz(n));
    }
}
