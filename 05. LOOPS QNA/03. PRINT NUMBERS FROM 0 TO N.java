// WRITE A CODE TO PRINT NUMBERS FROM 0 TO N ( N IS USER INPUT )
import java.util.Scanner;

public class Q3_Print0ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
