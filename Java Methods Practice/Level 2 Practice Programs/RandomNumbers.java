
public class RandomNumbers {
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(arr));
        double[] res = findAverageMinMax(arr);
        System.out.println("Average: " + res[0] + " Min: " + res[1] + " Max: " + res[2]);
    }
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for(int i=0;i<size;i++) arr[i] = (int)(1000 + Math.random()*9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr) {
        int sum = 0, min = arr[0], max = arr[0];
        for(int x: arr) {
            sum += x;
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        double avg = (double)sum/arr.length;
        return new double[]{avg,min,max};
    }
}
