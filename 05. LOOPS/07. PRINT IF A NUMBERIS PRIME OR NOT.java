// WRITE A CODE TO CHECK IF A NUMBERIS PRIME OR NOT 
import java.util.Scanner;

public class Q13_CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + " is " + (isPrime ? "Prime" : "Not Prime"));
    }
}

