// WRITE A CODE TO PRINT REVERSE OF A TABLE FOR A NUMBER
import java.util.Scanner;

public class Q11_ReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
