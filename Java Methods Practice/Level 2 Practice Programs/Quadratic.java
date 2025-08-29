
public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double[] roots = findRoots(a,b,c);
        if(roots.length==0) System.out.println("No Real Roots");
        else if(roots.length==1) System.out.println("Root: " + roots[0]);
        else System.out.println("Root1: " + roots[0] + " Root2: " + roots[1]);
    }
    static double[] findRoots(double a,double b,double c) {
        double delta = b*b - 4*a*c;
        if(delta > 0) {
            double r1 = (-b + Math.sqrt(delta))/(2*a);
            double r2 = (-b - Math.sqrt(delta))/(2*a);
            return new double[]{r1,r2};
        } else if(delta == 0) {
            double r = -b/(2*a);
            return new double[]{r};
        }
        return new double[]{};
    }
}
