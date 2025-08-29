
public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for(int i=0;i<10;i++) {
            ages[i] = sc.nextInt();
            boolean res = canStudentVote(ages[i]);
            System.out.println("Student " + (i+1) + ": " + (res ? "Can Vote" : "Cannot Vote"));
        }
    }
    public static boolean canStudentVote(int age) {
        if(age < 0) return false;
        return age >= 18;
    }
}
