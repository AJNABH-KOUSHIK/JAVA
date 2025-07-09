// WRITE A CODE TO PRINT FACTORIAL OF A NUMBER
import java.util.Scanner;

public class Q10_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial = " + fact);
    }
}
