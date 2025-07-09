// WRITE A CODE TO PRINT ALL PRIME NUMBERS IN A GIVEN RANGE
import java.util.Scanner;

public class Q15_PrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt(), high = sc.nextInt();

        for (int num = low; num <= high; num++) {
            boolean isPrime = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.print(num + " ");
        }
    }
}
