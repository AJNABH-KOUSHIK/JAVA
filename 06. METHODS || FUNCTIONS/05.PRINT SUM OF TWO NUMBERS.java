// WRITE A CODE TO PRINT SUM OF TWO NUMBERS USING METHODS
import java.util.Scanner;

public class Q20_SumUsingFunction {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println("Sum = " + sum(x, y));
    }
}
