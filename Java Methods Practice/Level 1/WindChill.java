
public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        double wind = sc.nextDouble();
        double res = calculateWindChill(temp, wind);
        System.out.println("Wind Chill Temperature: " + res);
    }
    public static double calculateWindChill(double temp, double wind) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind, 0.16);
    }
}
