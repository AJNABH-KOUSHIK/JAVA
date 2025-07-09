// WRITE A CODE TO PRINT TO STORE N FIBONACCI NUMBERS IN ARRAY
import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fib = new int[n];
        
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int num : fib) {
            System.out.print(num + " ");
        }
    }
}
