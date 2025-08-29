public class NumberChecker5 {
    public static int sumDiv(int n){
        int s=0;for(int i=1;i<=n/2;i++)if(n%i==0)s+=i;return s;
    }
    public static boolean perfect(int n){return sumDiv(n)==n;}
    public static boolean abundant(int n){return sumDiv(n)>n;}
    public static boolean deficient(int n){return sumDiv(n)<n;}
    public static int fact(int n){int f=1;for(int i=1;i<=n;i++)f*=i;return f;}
    public static boolean strong(int n){
        int t=n,s=0;while(t>0){s+=fact(t%10);t/=10;}return s==n;
    }
    public static void main(String[] args){
        int n=28;
        System.out.println("Perfect:"+perfect(n));
        System.out.println("Abundant:"+abundant(n));
        System.out.println("Deficient:"+deficient(n));
        System.out.println("Strong:"+strong(n));
    }
}
