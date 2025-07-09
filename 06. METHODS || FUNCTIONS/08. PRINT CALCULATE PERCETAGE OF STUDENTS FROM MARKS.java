// WRITE A CODE TO PRINT CALCULATE PERCETAGE OF STUDENTS FROM MARKS
import java.util.Scanner;

public class PercentageCalculator {
    static double calculatePercentage(int science, int maths, int sanskrit) {
        int total = science + maths + sanskrit;
        return (total / 3.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), m = sc.nextInt(), sa = sc.nextInt();
        System.out.println("Percentage = " + calculatePercentage(s, m, sa) + "%");
    }
}
